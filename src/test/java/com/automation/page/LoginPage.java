package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	WebElement userNameInput;

	@FindBy(id = "spanMessage")
	WebElement loginErrorMsg;

	@FindBy(id = "txtPassword")
	WebElement passwordInput;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(css = "#forgotPasswordLink a")
	WebElement forgetPasswordLink;

	public void clickOnForgetPassLink() {
		forgetPasswordLink.click();
	}

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void validateLoginErrorMsg() {
		System.out.println(loginErrorMsg.isDisplayed());
	}

	public void openWebsite() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	public void doLogin(String usernmae, String password) {
		userNameInput.sendKeys(usernmae);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

}
