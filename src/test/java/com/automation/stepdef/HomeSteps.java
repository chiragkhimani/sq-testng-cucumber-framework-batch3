package com.automation.stepdef;

import com.automation.page.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	HomePage homePage = new HomePage(DriverUtils.getDriver());

	@Then("verify user is navigated to homepage")
	public void verify_user_is_navigated_to_homepage() {
		homePage.validateHomePage();
	}

	@When("user selects user menu from Admin tab")
	public void user_selects_user_menu_from_admin_tab() {
		homePage.selectUsersMenu();
	}
}
