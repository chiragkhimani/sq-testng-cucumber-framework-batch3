package com.automation.page;

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

	public AddUserPage(WebDriver driver) {
		super(driver);
	}

	public void fillRequiredUserDetails() {
		employeeName.sendKeys(PropertyReader.getProperty("employee.name"));
		userNameInput.sendKeys(PropertyReader.getProperty("adduser.username"));
		passwordInput.sendKeys(PropertyReader.getProperty("adduser.password"));
		confirmPasswordInput.sendKeys(PropertyReader.getProperty("adduser.password"));
	}

	public void clickOnSaveBtn() {
		commonMethods.waitForElementToBeClickable(saveBtn);
		saveBtn.click();
	}

}
