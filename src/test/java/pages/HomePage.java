package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;

	
	@FindBy (xpath = "//h4[text()='Welcome Admin Admin!']") 
	public WebElement loginsuccesstext ;
	
	public String Loginseccessfullytext()
	{
		return loginsuccesstext.getText();
	}
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
