package utils;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class WaitUtils 
{
	
	
	//====================   1. Visibility / Presence      =====================
	
	public static void visibilityOf(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public static void presenceOfElementLocated(WebDriver driver, By locator) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
	
	public static void visibilityOfAllElements(WebDriver driver, List<WebElement> element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
	
	public static void visibilityOfAllElementsLocatedBy(WebDriver driver, By locator) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
	
	
	
	//====================    Clickable     ====================   
	
	
	public static void elementToBeClickable(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
	public static void elementToBeClickable(WebDriver driver, By locator) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
	
	
	
	//====================    3. Invisibility    ====================   
	
	
	public static void invisibilityOf(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(element));
    }
	
	public static void invisibilityOfElementLocated(WebDriver driver, By locator) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
	
	
	
	//====================    4. Text Conditions      ====================   
	
	
	public static void textToBePresentInElement(WebDriver driver, WebElement element, String expectedText) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }
	
	public static void textToBePresentInElementLocated(WebDriver driver, By locator, String expectedText) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedText));
    }
	
	public static void textToBePresentInElementValue(WebDriver driver, WebElement element, String expectedText) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, expectedText));
    }
	
	
	//====================    5. Title Conditions     ====================   
	
	
	public static void titleIs(WebDriver driver, String expectedTitle) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
    }
	
	public static void titleContains(WebDriver driver, String expectedTitle) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(expectedTitle));
    }
	
	
	
	//====================    6. URL Conditions     ====================   
	
	
	public static void urlToBe(WebDriver driver, String expectedTitle) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedTitle));
    }
	
	public static void urlContains(WebDriver driver, String expectedTitle) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlContains(expectedTitle));
    }
	
	public static void urlMatches(WebDriver driver, String expectedTitle) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlMatches(expectedTitle));
    }
	
	
	//====================    7. Alert Handling    ====================   
	
	
	public static void alertIsPresent(WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
    }
	
	
	//====================     8. Frame Handling    ====================   
	
	
	public static void frameToBeAvailableAndSwitchToIt(WebDriver driver, int frameIndex) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
    }
	
	public static void frameToBeAvailableAndSwitchToIt(WebDriver driver, String nameOrId) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
    }
	
	public static void frameToBeAvailableAndSwitchToIt(WebDriver driver, By locator) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }
	
	public static void frameToBeAvailableAndSwitchToIt(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }
	
	
	//====================     9. Selection (Dropdown / Checkbox)   ====================     
	
	public static void elementToBeSelected(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(element));
    }
	
	public static void elementSelectionStateToBe(WebDriver driver, WebElement element, boolean selected) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
    }
	
	public static void elementSelectionStateToBe(WebDriver driver, By locator, boolean selected) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementSelectionStateToBe(locator, selected));
    }
	
	
	
	//====================      10. Number of Elements    ====================     
	
	
	public static void numberOfElementsToBe(WebDriver driver, By locator, int number) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBe(locator, number));
    }
	
	public static void numberOfElementsToBeMoreThan(WebDriver driver, By locator, int number) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, number));
    }
	
	public static void numberOfElementsToBeLessThan(WebDriver driver, By locator, int number) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(locator, number));
    }
	
	
	//====================     11. Staleness (Very Important 🔥)   ====================     
	
	
	
	public static void stalenessOf(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.stalenessOf(element));
    }
	
	
	//====================     12. Attribute Conditions   ====================  
	
	
	public static void attributeToBe(WebDriver driver, WebElement element, String attribute, String value) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
    }
	
	public static void attributeContains(WebDriver driver, WebElement element, String attribute, String value) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeContains(element, attribute, value));
    }
	
	public static void attributeToBeNotEmpty(WebDriver driver, WebElement element, String attribute) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
    }
	
	
}
