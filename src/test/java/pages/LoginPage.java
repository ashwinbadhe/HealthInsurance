package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage 
{
	WebDriver driver;
	
	@FindBy (xpath = "(//input[@class='MuiInputBase-input MuiInput-input'])[1]")
	public WebElement username;
	
	@FindBy (xpath = "(//input[@class='MuiInputBase-input MuiInput-input'])[2]")
	public WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement login;
	
	@FindBy (xpath = "//span[text()='Ok']")
	public WebElement ok;
	
	@FindBy (xpath = "//div[contains(@class,'MuiBox-root jss7')]//span[text()='Forgot Password ?']")
	public WebElement forgotpasswordbutton;
	
	@FindBy (xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 MuiGrid-direction-xs-column']/div[3]/following-sibling::div[1]/div")
	public WebElement loginvalidationmessage;
	
	public void enterusername(String un)
	{
		username.sendKeys(un);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void clickOk() {
		if (ok.isDisplayed()) {
			ok.click();
		}
	}
	
	public void forgotPassword()
	{
		forgotpasswordbutton.click();
	}
	
	public String Loginvalidationmessage()
	{
		return loginvalidationmessage.getText(); 
	}
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
