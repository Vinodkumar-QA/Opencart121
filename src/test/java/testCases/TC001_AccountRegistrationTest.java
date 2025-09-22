package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass
{
	
	
	@Test(groups={"Regression","master"})
	public void registration() throws InterruptedException 
	{
		logger.info("=================Starting TC01_AccountRegistrationTest=======================");
		
		
		
		    HomePage hp = new HomePage(driver);
		    Thread.sleep(3000);
		    hp.clickmyaccount();
		    logger.info("======Clicked on MyAccount======");

		    hp.clickregister();
		    logger.info("======Clicked on Register link======");

		    RegisterPage rp = new RegisterPage(driver);
		    logger.info("======Providing customer register details======");
		    rp.setfirstname("test090");
		    rp.setlastname("user");
		    rp.setemail(randomString() + "@mail.com"); // Make sure randomString() is defined
		    rp.settelephone("2154986587");
		    rp.setpassword("test090");
		    rp.setpasswordconfirm("test090");
		    rp.checkpilocy();
		    rp.clickconfirm();
		    logger.info("======Clicked on confirm button======");

		    boolean status=rp.ismsgdisplayed();
		    
		    Assert.assertEquals(status, true);
		   
		    

		logger.info("====================Finished TC01_AccountRegistrationTest====================");
	}

}
