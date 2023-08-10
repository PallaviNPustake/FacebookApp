package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(xpath = "//input[@id='email']") private WebElement emailIDField;
	@FindBy(xpath = "//input[@id='pass']") private WebElement passwordField;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailid(String email)
	{
		emailIDField.sendKeys(email);
	}
	public void enterPassword(String pwd)
	{
		passwordField.sendKeys(pwd);
	}
	public boolean isDisplayedEmailIdField()
	{
		boolean status = emailIDField.isDisplayed();
		return status;
	}
	public boolean isDisplayedPasswordField()
	{
		boolean status = passwordField.isDisplayed();
		return status;
	}
}
