package com.automation.stepdef;

import com.automation.page.UserDetailsPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserDetailsSteps {

	UserDetailsPage userDetailsPage = new UserDetailsPage(DriverUtils.getDriver());

	@Then("verify user is on user details page")
	public void verify_user_is_on_user_details_page() {
		userDetailsPage.verifyUserDetailsPage();
	}

	@And("verify all fields are disabled on user details page")
	public void verify_all_fields_are_disabled_on_user_details_page() {
		userDetailsPage.verifyAllFieldsDisabled();
	}
}
