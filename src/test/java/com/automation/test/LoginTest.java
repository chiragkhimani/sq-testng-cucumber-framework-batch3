package com.automation.test;

import org.testng.annotations.Test;

import com.automation.page.ForgetPasswordPage;
import com.automation.page.HomePage;
import com.automation.page.LoginPage;

public class LoginTest extends BaseTest {

	@Test(groups = { "smoke", "chirag" }, enabled = false)
	public void verifyLoginSuccessfulWithValidCred() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openWebsite();
		loginPage.doLogin("admin", "admin123");

		HomePage homePage = new HomePage(driver);
		homePage.validateHomePage();
	}

	@Test(groups = { "regression", "yusuf" }, enabled = false)
	public void verifyLoginUnSuccessfulWithInValidCred() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openWebsite();
		loginPage.doLogin("admin123", "addd");
		loginPage.validateLoginErrorMsg();
	}

	@Test(groups = { "regression", "chirag" }, enabled = false)
	public void verifyLoginUnSuccessfulWithBlankCred() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openWebsite();
		loginPage.doLogin("", "");
		loginPage.validateLoginErrorMsg();
	}

	@Test
	public void verifyErrorMsgForForgetPasswordIncorrectUser() {
		LoginPage loginPage = new LoginPage(driver);
		ForgetPasswordPage forgetPassPage = new ForgetPasswordPage(driver);
		loginPage.openWebsite();
		loginPage.clickOnForgetPassLink();
		forgetPassPage.enterUsername("TetsDemoIncorrect");
		forgetPassPage.clickOnResetPasswordBtn();
		forgetPassPage.verifyIncorrectUsernameErrorMsg();
	}

}
