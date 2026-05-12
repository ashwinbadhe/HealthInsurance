package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener  
{

	@Override
	public void onTestSuccess(ITestResult result) {


		try
		{
			Object testClass = result.getInstance();

	        WebDriver driver = ((BaseClass) testClass).driver;
		
		String className = result.getTestClass()
				.getRealClass().getSimpleName()
                + "_" + result.getName();

		ScreenshotUtils.passcapture(driver, className);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {


		try
		{
			Object testClass = result.getInstance();

	        WebDriver driver = ((BaseClass) testClass).driver;
		
		String className = result.getTestClass()
				.getRealClass().getSimpleName()
                + "_" + result.getName();

		ScreenshotUtils.failcapture(driver, className);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
