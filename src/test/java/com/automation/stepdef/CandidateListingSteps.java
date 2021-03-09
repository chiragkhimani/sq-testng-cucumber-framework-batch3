package com.automation.stepdef;

import com.automation.page.CandidateListingPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CandidateListingSteps {

	CandidateListingPage candidateListingPage = new CandidateListingPage(DriverUtils.getDriver());

	@Then("verify user is on candidate listing page")
	public void verify_user_is_on_candidate_listing_page() {
		candidateListingPage.verifyCandidatePage();
	}

	@When("user click on add button on candidate listing page")
	public void user_click_on_add_button_on_candidate_listing_page() {
		candidateListingPage.clickOnAddBtn();
	}
}
