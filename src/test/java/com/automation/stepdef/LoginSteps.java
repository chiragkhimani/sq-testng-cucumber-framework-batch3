package com.automation.stepdef;

import com.automation.page.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage(DriverUtils.getDriver());

	@Given("user open website")
	public void user_open_website() {
		loginPage.openWebsite();
	}

	@Then("verify user is on login page")
	public void verify_user_is_on_login_page() {
		loginPage.verifyLoginPage();
	}

	@When("user login with valid credentials")
	public void user_enters_valid_credentials() {
		loginPage.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
	}

	@When("user login with invalid credentials")
	public void user_login_with_invalid_credentials() {
		loginPage.doLogin(PropertyReader.getProperty("invalid.login.username"),
				PropertyReader.getProperty("invalid.login.password"));
	}

	@Then("verify invalid login error message is displayed")
	public void verify_invalid_login_error_message() {
		loginPage.validateLoginErrorMsg();
	}

	@When("user click on forget password link")
	public void user_click_on_forget_password_link() {
		loginPage.clickOnForgetPassLink();
	}

	@When("user login with blank credentials")
	public void user_login_with_blank_credentials() {
		loginPage.doLogin("", "");
	}
	
	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String usernameKey, String passwordKey) {
		loginPage.doLogin(PropertyReader.getProperty(usernameKey), PropertyReader.getProperty(passwordKey));
	}
	
	@When("user login with invalid credential username {string} and password {string}")
	public void user_login_with_invalid_credential_username_and_password(String username, String password) {
		loginPage.doLogin(username, password);
	}
	
	@Given("user open the datatables website")
	public void user_open_the_datatables_website() {
		loginPage.openDatatablesWebsite();
	}

}
