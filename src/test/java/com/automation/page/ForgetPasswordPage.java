package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage extends BasePage {

	@FindBy(id = "securityAuthentication_userName")
	WebElement userNameInput;

	@FindBy(id = "btnSearchValues")
	WebElement resetPassBtn;

	@FindBy(xpath = "//div[@class='message warning fadable']")
	WebElement incorrectUsernameErrorMsg;

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String username) {
		userNameInput.sendKeys(username);
	}

	public void clickOnResetPasswordBtn() {
		commonMethods.waitForElementToBeClickable(resetPassBtn);
		resetPassBtn.click();
	}

	public void verifyIncorrectUsernameErrorMsg() {
		System.out.println(driver.getPageSource());
		System.out.println(incorrectUsernameErrorMsg.isDisplayed());
		System.out.println(incorrectUsernameErrorMsg.getText());
	}

}
