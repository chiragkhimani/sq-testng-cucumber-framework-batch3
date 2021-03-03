package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(id = "branding")
	WebElement logo;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminMenu;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementMenu;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement userMenu;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void validateHomePage() {
		commonMethods.waitForElementToBeVisible(logo);
		System.out.println(logo.isDisplayed());
	}

	public void selectUsersMenu() {
		commonMethods.waitForElementToBeVisible(adminMenu);
		action.moveToElement(adminMenu).moveToElement(userManagementMenu).click(userMenu).build().perform();
	}

}
