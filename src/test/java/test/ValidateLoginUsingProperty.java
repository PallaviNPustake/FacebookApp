package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Base;
import pom.LoginPage;
import utility.Utility;

@Listeners(listner.Listener.class)
public class ValidateLoginUsingProperty extends Base {
  @Test
  public void f() {
  }LoginPage lp;
	
	@BeforeClass
	public void navigateFacebook() throws IOException
	{
		openFacebookApp();
		lp = new LoginPage(driver);
		Utility.imlicitWait(driver, 3000);
	}
@Test(priority = -1)
public void validateEmailIDField() throws IOException {
	  
	  Assert.assertTrue(lp.isDisplayedEmailIdField(),"Email id is not displayed");
	  Reporter.log("Email id field is displayed", true);
	  lp.enterEmailid(Utility.readDataFromPropertyFile("email"));
	  Utility.imlicitWait(driver, 5000);
	  //Assert.fail();
}
@Test
public void validatePasswordField() throws IOException
{
	  Assert.assertTrue(lp.isDisplayedPasswordField(),"Password field is not displayed");
	  Reporter.log("Password field is displayed", true);
	  Utility.imlicitWait(driver, 3000);
	  lp.enterPassword(Utility.readDataFromPropertyFile("pwd"));
}

@AfterClass
public void tearDownBrowser()
{ Utility.imlicitWait(driver, 3000);
	  closeBrowser();	  
}
}
