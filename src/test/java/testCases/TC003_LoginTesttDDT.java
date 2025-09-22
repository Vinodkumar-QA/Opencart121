package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginTesttDDT extends BaseClass
{
	
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class,groups={"datadriven"})
	public void loginDDT(String email, String password, String expected)
	{
		
		
		logger.info("==========Starting TC03_LoginTestDDT=============");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setloginusername(email);
		lp.setloginuserpassword(password);
		lp.clicklogin();
		
		
		
		MyAccountPage map=new MyAccountPage(driver);
		
		boolean status=map.ismymsgdisplayed();
		
		
	//1) creds valid - success	- pass
	//				 - not success - fail
		
	//2) creds not valid - success - fail
	//					 - not success - pass
		
		
		if(expected.equalsIgnoreCase("valid"))
		{
			if(status==true)
			{
				map.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(expected.equalsIgnoreCase("invalid"))
		{
			if(status==true)
			{
				map.clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}
		catch(Exception e)
		{
			Assert.fail("An exception occured:"+e.getMessage());
		}
		logger.info("==========Ending TC03_LoginTestDDT=============");
 }
}
