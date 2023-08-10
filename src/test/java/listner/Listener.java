package listner;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.Base;
import utility.Utility;

public class Listener extends Base implements ITestListener {

	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log(result.getName()+"-Test case successfully executed", true);
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Utility.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Reporter.log(result.getName()+"-tc is failed", true);
	}
}
