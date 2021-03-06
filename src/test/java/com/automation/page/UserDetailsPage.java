package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetailsPage extends BasePage {

	@FindBy(id = "systemUser_userType")
	WebElement userRole;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement employeeName;

	@FindBy(id = "systemUser_userName")
	WebElement username;

	@FindBy(id = "systemUser_status")
	WebElement status;

	public UserDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void verifyUserDetailsPage() {
		commonMethods.waitForElementToBeVisible(userRole);
		Assert.assertTrue("User details page is not dispalyed", userRole.isDisplayed());
	}

	public void verifyAllFieldsDisabled() {
		Assert.assertTrue("user Role is not disabled", !userRole.isEnabled());
		Assert.assertTrue("User details page is not dispalyed", !employeeName.isEnabled());
		Assert.assertTrue("User details page is not dispalyed", !username.isEnabled());
		Assert.assertTrue("User details page is not dispalyed", !status.isEnabled());
	}

}
