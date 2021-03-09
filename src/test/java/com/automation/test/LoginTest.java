package com.automation.test;

import org.testng.annotations.Test;

import com.automation.page.ForgetPasswordPage;
import com.automation.page.HomePage;
import com.automation.page.LoginPage;
import com.automation.utils.PropertyReader;

public class LoginTest extends BaseTest {

	public void verifyLoginSuccessfulWithValidCred() {
		loginPage.openWebsite();
		loginPage.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
		homePage.validateHomePage();
	}

	public void verifyLoginUnSuccessfulWithInValidCred() {
		loginPage.openWebsite();
		loginPage.doLogin("admin123", "addd");
		loginPage.validateLoginErrorMsg();
	}

	public void verifyLoginUnSuccessfulWithBlankCred() {
		loginPage.openWebsite();
		loginPage.doLogin("", "");
		loginPage.validateLoginErrorMsg();
	}

	public void verifyErrorMsgForForgetPasswordIncorrectUser() {
		loginPage.openWebsite();
		loginPage.clickOnForgetPassLink();
		forgetPassPage.enterUsername("InvalidUser");
		forgetPassPage.clickOnResetPasswordBtn();
		forgetPassPage.verifyIncorrectUsernameErrorMsg();
	}

}
