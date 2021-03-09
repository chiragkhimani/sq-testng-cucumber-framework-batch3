package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandidateListingPage extends BasePage {

	@FindBy(id = "candidateSearch_candidateName")
	WebElement candidateNameSeach;

	@FindBy(id = "btnAdd")
	WebElement addBtn;

	public CandidateListingPage(WebDriver driver) {
		super(driver);
	}

	public void verifyCandidatePage() {
		commonMethods.waitForElementToBeVisible(candidateNameSeach);
		Assert.assertTrue("Candidate listing page is not displayed", candidateNameSeach.isDisplayed());
		Assert.assertTrue("Candidate listing page is not displayed", addBtn.isDisplayed());
	}

	public void clickOnAddBtn() {
		addBtn.click();
	}

}
