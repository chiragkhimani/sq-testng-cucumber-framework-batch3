package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListingPage extends BasePage {

	@FindBy(id = "btnAdd")
	WebElement addBtn;

	@FindBy(xpath = "//div[@class='message success fadable']")
	WebElement addUserSuccessMsg;

	public UserListingPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnAddBtn() {
		commonMethods.waitForElementToBeVisible(addBtn);
		addBtn.click();
	}

	public void validateAddUserSuccessMsg() {
		Assert.assertTrue("Success Message is not present", addUserSuccessMsg.isDisplayed());
		Assert.assertTrue("Success Message is not error", addUserSuccessMsg.getText().equals("Error"));
	}

}
