package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

public class AddUserPage extends BasePage {

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement employeeName;

	@FindBy(id = "systemUser_userName")
	WebElement userNameInput;

	@FindBy(id = "systemUser_password")
	WebElement passwordInput;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmPasswordInput;

	@FindBy(id = "btnSave")
	WebElement saveBtn;

	@FindBy(xpath = "//input[@id='systemUser_confirmPassword']/following-sibling::span")
	WebElement confirmPasswordErrorMsg;

	public AddUserPage(WebDriver driver) {
		super(driver);
	}

	public void enterEmployeeName() {
		employeeName.sendKeys(PropertyReader.getProperty("employee.name"));
	}

	public void enterUsername() {
		userNameInput.sendKeys(PropertyReader.getProperty("adduser.username"));
	}

	public void enterPassword() {
		passwordInput.sendKeys(PropertyReader.getProperty("adduser.password"));
	}

	public void enterConfirmPassword() {
		confirmPasswordInput.sendKeys(PropertyReader.getProperty("adduser.password"));
	}

	public void enterDifferentConfirmPassword() {
		confirmPasswordInput.sendKeys(PropertyReader.getProperty("employee.name"));
	}

	public void clickOnSaveBtn() {
		commonMethods.waitForElementToBeClickable(saveBtn);
		saveBtn.click();
	}

	public void verifyErrorMsgForPasswordMismatch() {
		Assert.assertTrue("Confirm pasword error message is not displayed", confirmPasswordErrorMsg.isDisplayed());
		System.out.println(confirmPasswordErrorMsg.getText());
	}

}
