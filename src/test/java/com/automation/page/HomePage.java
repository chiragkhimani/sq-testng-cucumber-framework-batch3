package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(id = "branding")
	WebElement logo;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void validateHomePage() {
		System.out.println(logo.isDisplayed());
	}

}
