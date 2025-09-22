package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']") WebElement Myaccountlnk;

@FindBy(xpath="(//a[normalize-space()='Register'])[1]") WebElement Registerlnk;

@FindBy(xpath="//a[normalize-space()='Login']") WebElement loginlnk;
	
	

//Actions

public void clickmyaccount()
{
	Myaccountlnk.click();
}


public void clickregister()
{
	Registerlnk.click();
}

public void clicklogin()
{
	loginlnk.click();
}


}
