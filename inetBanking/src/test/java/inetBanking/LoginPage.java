package inetBanking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy (name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnlogin")
	@CacheLookup
	WebElement btlogin;
	
	
	
	public void setUsername(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		btlogin.click();
	}

	
	
}
