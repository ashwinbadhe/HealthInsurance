package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import retry.RetryAnalyzer;
import utils.ExcelUtils;
import utils.WaitUtils;

@Listeners(listeners.TestListener.class)
public class LoginTest extends BaseClass {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyValidLogin() throws Exception {
		// Create Page Object
		LoginPage loginPage = new LoginPage(driver);

		// wait before Element loading
		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		// Enter credentials
		loginPage.enterusername(ExcelUtils.getCellData(1, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(1, 3));

		// Step 3: Click Login
		loginPage.clickLogin();

		// Switch to Home Page
		HomePage homePage = new HomePage(driver);

		// wait for visible to text in home page
		WaitUtils.visibilityOf(driver, homePage.loginsuccesstext);

		Assert.assertTrue(homePage.Loginseccessfullytext().equalsIgnoreCase("Welcome Admin Admin!"));

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyInvalidPasswordLogin() throws Exception {

		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(2, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(2, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equalsIgnoreCase("The password or the username you've entered is incorrect."));

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyInvalidUsernameLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(3, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(3, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equals("The password or the username you've entered is incorrect."));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyInvalidCredentialsLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(4, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(4, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equalsIgnoreCase("The password or the username you've entered is incorrect."));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyBlankUsernameValidation() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(5, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(5, 3));

		Assert.assertFalse(loginPage.login.isEnabled());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class) 
	public void verifyBlankPasswordValidation() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(6, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(6, 3));

		Assert.assertFalse(loginPage.login.isEnabled());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyBlankCredentialsValidation() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(7, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(7, 3));

		Assert.assertFalse(loginPage.login.isEnabled());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifySpecialCharacterLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(8, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(8, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equals("The password or the username you've entered is incorrect."));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyLeadingSpaceUsernameLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(9, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(9, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equalsIgnoreCase("The password or the username you've entered is incorrect."));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyTrailingSpaceUsernameLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(10, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(10, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equalsIgnoreCase("The password or the username you've entered is incorrect."));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyLeadingSpacePasswordLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(11, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(11, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equalsIgnoreCase("The password or the username you've entered is incorrect."));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyTrailingSpacePasswordLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);

		WaitUtils.visibilityOf(driver, loginPage.username);

		loginPage.clickOk();
		loginPage.enterusername(ExcelUtils.getCellData(12, 2));
		loginPage.enterpassword(ExcelUtils.getCellData(12, 3));

		loginPage.clickLogin();

		WaitUtils.visibilityOf(driver, loginPage.loginvalidationmessage);

		Assert.assertTrue(loginPage.Loginvalidationmessage()
				.equalsIgnoreCase("The password or the username you've entered is incorrect."));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyForgotPasswordSuccessfully() throws Exception {

		LoginPage loginPage = new LoginPage(driver);
		WaitUtils.visibilityOf(driver, loginPage.forgotpasswordbutton);
		
		loginPage.clickOk();
		loginPage.forgotPassword();
		
		ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage(driver);
		WaitUtils.visibilityOf(driver, forgotpasswordpage.enterusername);

		forgotpasswordpage.enterusername(ExcelUtils.getCellData(13, 2));

		forgotpasswordpage.clickSubmitButton();
		
		Thread.sleep(10000);
		String as = forgotpasswordpage.Successfullmessage();
		System.out.println(as);
		Assert.assertTrue(forgotpasswordpage.Successfullmessage()
				.equals("Done ! Check your inbox and click on the verification link to reset your password."));
		
		loginPage.clickOk();
	}

}
