package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test_class.BaseTest;

public class Listener extends BaseTest implements ITestListener{
	ScreenShot sc;
	public void onTestFailure(ITestResult result) {
		sc =new ScreenShot();
		try {
			sc.screenshot(driver, result.getName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
