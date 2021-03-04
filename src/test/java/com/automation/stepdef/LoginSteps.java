package com.automation.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user open website")
	public void user_open_website() {
		System.out.println("Step - 1");
	}

	@Then("verify user is on login page")
	public void verify_user_is_on_login_page() {
		System.out.println("Step - 2");
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {

	}

	@Then("verify user is not on login page")
	public void verify_user_is_not_on_login_page() {

	}

	@Then("verify user is navigated to homepage")
	public void verify_user_is_navigated_to_homepage() {

	}

}
