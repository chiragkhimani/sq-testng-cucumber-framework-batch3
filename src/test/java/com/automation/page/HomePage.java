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
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	WebElement recruitmentMenu;
	
	@FindBy(id = "menu_recruitment_viewCandidates")
	WebElement candidateTab;
	

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

	public void selectCandiateTab() {
		commonMethods.waitForElementToBeVisible(recruitmentMenu);
		action.moveToElement(recruitmentMenu).click(candidateTab).build().perform();

	}

}
