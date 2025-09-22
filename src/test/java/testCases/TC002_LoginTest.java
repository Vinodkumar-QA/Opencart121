package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass
{
	
	@Test(groups={"sanity","master"})
	public void Verify_Login()
	{
		logger.info("============Starting TC_002_LoginTest==============");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		logger.info("============Clicked on login button in home page==============");
		
		LoginPage lp=new LoginPage(driver);
		lp.setloginusername(p.getProperty("username"));
		lp.setloginuserpassword(p.getProperty("password"));
		lp.clicklogin();
		logger.info("============Clicked on login==============");
		
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetpage=map.ismymsgdisplayed();
		
		Assert.assertEquals(targetpage, true, "Element not found");
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("============Finished TC_002_LoginTest==============");
	}
	
	
}
