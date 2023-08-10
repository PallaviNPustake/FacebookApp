package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pom.LoginPage;
import utility.Utility;

public class ValidateLoginPageUsingDataProvider extends Base {
	LoginPage lp;
	
	@BeforeMethod
	public void navigateFacebook() throws IOException
	{
		openFacebookApp();
		lp = new LoginPage(driver);
	
		Utility.imlicitWait(driver, 3000);
	}
  @Test(dataProvider = "LoginData", dataProviderClass = test.FBDataProvider.class)
  public void validateEmailIDField(String email, String pwd) {
	  
	  Assert.assertTrue(lp.isDisplayedEmailIdField(),"Email id is not displayed");
	  Reporter.log("Email id field is displayed", true);
	  lp.enterEmailid(email);
	  Utility.imlicitWait(driver, 5000);
	  Assert.assertTrue(lp.isDisplayedPasswordField(),"Password field is not displayed");
	  Reporter.log("Password field is displayed", true);
	  Utility.imlicitWait(driver, 3000);
	  lp.enterPassword(pwd);
  }
  
//  @AfterClass
//  public void tearDownBrowser()
//  { Utility.imlicitWait(driver, 3000);
//	  closeBrowser();	  
//  }
}
