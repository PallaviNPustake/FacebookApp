package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pom.LoginPage;
import utility.Utility;

public class ValidateLoginPage extends Base {
	LoginPage lp;
	
	@BeforeClass
	public void navigateFacebook() throws IOException
	{
		openFacebookApp();
		lp = new LoginPage(driver);
		Utility.imlicitWait(driver, 3000);
	}
  @Test(priority = -1)
  public void validateEmailIDField() {
	  
	  Assert.assertTrue(lp.isDisplayedEmailIdField(),"Email id is not displayed");
	  Reporter.log("Email id field is displayed", true);
	  lp.enterEmailid("Pallavip@gmail.com");
	  Utility.imlicitWait(driver, 5000);
  }
  @Test
  public void validatePasswordField()
  {
	  Assert.assertTrue(lp.isDisplayedPasswordField(),"Password field is not displayed");
	  Reporter.log("Password field is displayed", true);
	  Utility.imlicitWait(driver, 3000);
	  lp.enterPassword("123");
  }
  
  @AfterClass
  public void tearDownBrowser()
  { Utility.imlicitWait(driver, 1000);
	  closeBrowser();	  
  }
}
