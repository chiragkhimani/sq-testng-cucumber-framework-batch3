package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.PropertyReader;

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

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnForgetPassLink() {
		forgetPasswordLink.click();
	}

	public void validateLoginErrorMsg() {
		System.out.println(loginErrorMsg.isDisplayed());
	}

	public void openWebsite() {
		driver.get(PropertyReader.getProperty("app.url"));
	}

	public void doLogin(String usernmae, String password) {
		commonMethods.waitForElementToBeVisible(userNameInput);
		userNameInput.sendKeys(usernmae);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public void verifyLoginPage() {
		Assert.assertTrue("Login page is not displayed", userNameInput.isDisplayed());
		Assert.assertTrue("Login page is not displayed", passwordInput.isDisplayed());
	}

	public void openDatatablesWebsite() {
		driver.get("https://datatables.net/");
	}

}
