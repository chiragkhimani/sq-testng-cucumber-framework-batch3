package com.automation.stepdef;

import com.automation.page.UserListingPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserListingSteps {

	UserListingPage userListingPage = new UserListingPage(DriverUtils.getDriver());

	@And("click on add button")
	public void click_on_add_button() {
		userListingPage.clickOnAddBtn();
	}

	@Then("verify add user success message is displayed")
	public void verify_add_user_success_message_is_displayed() {
		userListingPage.validateAddUserSuccessMsg();
	}

	@When("click on admin user link")
	public void click_on_admin_user_link() {
		userListingPage.clickOnAdminUserLink();
	}

	@When("user search with admin user")
	public void user_search_with_admin_user() {
		userListingPage.searchWithAdminUser();
	}
}
