package com.automation.stepdef;

import com.automation.page.AddCandidatePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCandidateSteps {
	
	AddCandidatePage addCandidatePage = new AddCandidatePage(DriverUtils.getDriver());

	@Then("verify user is on add candidate page")
	public void verify_user_is_on_add_candidate_page() {
		addCandidatePage.verifyAddCandidatePage();
	}

	@When("user fill required candidate details")
	public void user_fill_required_candidate_details() {
		addCandidatePage.fillCandidateDetails();
	}

	@And("upload resume file")
	public void upload_resume_file() {
		addCandidatePage.uploadResumeFile();
	}

	@When("click on save button on add candidate page")
	public void click_on_save_button_on_add_candidate_page() {
		addCandidatePage.clickOnSaveBtn();
	}

	@Then("verify success message is displayed")
	public void verify_success_message_is_displayed() {
		addCandidatePage.verifyAddCandidateSuccessMessage();
	}

}
