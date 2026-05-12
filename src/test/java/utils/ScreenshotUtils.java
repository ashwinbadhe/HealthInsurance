package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils 
{
	public static void passcapture(WebDriver driver, String ClassName) throws Exception 
	{
		String dateTime = new SimpleDateFormat("ddMMyyyy_HHmmss")
                .format(new Date());
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Ashwin\\eclipse-workspace\\HealthInsuranceAutomationSuite\\test-output\\screenshots\\pass\\" + ClassName + "_" + dateTime + ".png");
        FileHandler.copy(src, dest);
    }
	
	public static void failcapture(WebDriver driver, String ClassName) throws Exception 
	{
		String dateTime = new SimpleDateFormat("ddMMyyyy_HHmmss")
                .format(new Date());
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Ashwin\\eclipse-workspace\\HealthInsuranceAutomationSuite\\test-output\\screenshots\\fail\\" + ClassName + "_" + dateTime + ".png");
        FileHandler.copy(src, dest);
    }
}
