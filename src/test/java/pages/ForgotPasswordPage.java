/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 */
public class ForgotPasswordPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiInput-input']")
	public WebElement enterusername;
	
	@FindBy(xpath = "//span[text()='Submit']")
	public WebElement submit;
	
	@FindBy(className = "MuiBox-root")
	public WebElement successfullmessage;

	public void enterusername(String un) {
		enterusername.sendKeys(un);
	}
	
	public void clickSubmitButton() {
		submit.click();
	}

	public String Successfullmessage()
	{
		return successfullmessage.getText();
	}
	
	public ForgotPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
