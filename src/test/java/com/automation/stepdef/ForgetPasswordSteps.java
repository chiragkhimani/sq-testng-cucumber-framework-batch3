package com.automation.stepdef;

import com.automation.page.ForgetPasswordPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgetPasswordSteps {
	
	ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage(DriverUtils.getDriver());

	@Then("verify user is on forget password page")
	public void verify_user_is_on_forget_password_page() {
		forgetPasswordPage.verifyForgetPasswordPage();
	}

	@When("user enter invalid username on forget password page")
	public void user_enter_invalid_username_on_forget_password_page() {
		forgetPasswordPage.enterUsername(PropertyReader.getProperty("invalid.login.username"));
	}

	@When("click on reset password button")
	public void click_on_reset_password_button() {
		forgetPasswordPage.clickOnResetPasswordBtn();
	}

	@Then("verify invalid username error message is displayed on forget password page")
	public void verify_invalid_username_error_message_is_displayed_on_forget_password_page() {
		forgetPasswordPage.verifyIncorrectUsernameErrorMsg();
	}

}
