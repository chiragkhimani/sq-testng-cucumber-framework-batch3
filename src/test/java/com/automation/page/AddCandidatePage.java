package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.PropertyReader;

public class AddCandidatePage extends BasePage {

	@FindBy(id = "addCandidate_firstName")
	WebElement firstName;

	@FindBy(id = "addCandidate_lastName")
	WebElement lastName;

	@FindBy(id = "addCandidate_email")
	WebElement email;

	@FindBy(id = "addCandidate_vacancy")
	WebElement vacancyDropdown;

	@FindBy(id = "addCandidate_resume")
	WebElement resumeUploadInput;

	@FindBy(id = "addCandidate_comment")
	WebElement comment;

	@FindBy(id = "btnSave")
	WebElement saveBtn;

	@FindBy(xpath = "//div[@class='message success fadable']")
	WebElement addUserSuccessMsg;

	public AddCandidatePage(WebDriver driver) {
		super(driver);
	}

	public void verifyAddCandidatePage() {
		commonMethods.waitForElementToBeVisible(firstName);
		Assert.assertTrue("Add Candidate page is not displayed", firstName.isDisplayed());
		Assert.assertTrue("Add Candidate page is not displayed", lastName.isDisplayed());
	}

	public void fillCandidateDetails() {
		firstName.sendKeys(PropertyReader.getProperty("candidate.firstname"));
		lastName.sendKeys(PropertyReader.getProperty("candidate.lastname"));
		email.sendKeys(PropertyReader.getProperty("candidate.email"));

		Select vacancyDropdownSelect = new Select(vacancyDropdown);
		vacancyDropdownSelect.selectByIndex(1);

		comment.sendKeys(PropertyReader.getProperty("candidate.comment"));

	}

	public void uploadResumeFile() {
		resumeUploadInput.sendKeys(System.getProperty("user.dir")+"//src//test//resources//data//TestResume.txt");
	}

	public void clickOnSaveBtn() {
		saveBtn.click();
	}

	public void verifyAddCandidateSuccessMessage() {
		commonMethods.waitForElementToBeVisible(addUserSuccessMsg);
		Assert.assertTrue("Success Message is not present", addUserSuccessMsg.isDisplayed());
	}

}
