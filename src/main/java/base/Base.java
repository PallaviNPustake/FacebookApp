package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.Utility;

public class Base {

	static protected WebDriver driver;
	
	public void openFacebookApp() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility.readDataFromPropertyFile("url"));
		Reporter.log("Opening facebook apllication", true);
	}
	
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("Teardown browser", true);
	}
	
}
