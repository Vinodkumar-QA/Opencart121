package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_firstname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_lastname;
	@FindBy(xpath="//input[@id='input-email']")  WebElement txt_email;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_telephone;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_password_confirm;
	@FindBy(xpath="//input[@name='agree']") WebElement checkbox_policy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btn_confirm;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement message;
	
	
	public void setfirstname(String fname)
	{
		txt_firstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void settelephone(String telephone)
	{
		txt_telephone.sendKeys(telephone);
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void setpasswordconfirm(String passwordconfirm)
	{
		txt_password_confirm.sendKeys(passwordconfirm);
	}
	
	public void checkpilocy()
	{
		checkbox_policy.click();
	}
	
	public void clickconfirm()
	{
		btn_confirm.click();
	}
	
	
	
	public boolean ismsgdisplayed()
	{
		return(message.isDisplayed());
	}
	
	
	public String confirmsg()
	{
		return message.getText();
	}
	
}
