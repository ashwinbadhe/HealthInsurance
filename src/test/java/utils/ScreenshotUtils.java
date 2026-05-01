package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils 
{
	public static void capture(WebDriver driver, String name) throws Exception 
	{
		TakesScreenshot tc = (TakesScreenshot)driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshots/" + name + ".png");
        FileUtils.copyFile(src, dest);
        FileHandler.copy(src, dest);
    }
}
