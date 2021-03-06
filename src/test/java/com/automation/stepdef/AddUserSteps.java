package com.automation.stepdef;

import com.automation.page.AddUserPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserSteps {

	AddUserPage addUserPage = new AddUserPage(DriverUtils.getDriver());

	@And("fill required user details on add user page")
	public void fill_required_user_details_on_add_user_page() {
		addUserPage.enterEmployeeName();
		addUserPage.enterUsername();
		addUserPage.enterPassword();
		addUserPage.enterConfirmPassword();
	}

	@And("click on save button")
	public void click_on_save_button() {
		addUserPage.clickOnSaveBtn();
	}

	@Then("verify confirm password error message is dispalyed")
	public void verify_confirm_password_error_message_is_dispalyed() {
		addUserPage.verifyErrorMsgForPasswordMismatch();
	}

	@When("user enters required user details with different confirm password")
	public void user_enters_required_user_details_with_different_confirm_password() {
		addUserPage.enterEmployeeName();
		addUserPage.enterUsername();
		addUserPage.enterPassword();
		addUserPage.enterDifferentConfirmPassword();
	}

}
