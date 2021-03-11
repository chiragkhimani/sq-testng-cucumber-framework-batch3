package com.automation.page;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	@FindBy(xpath = "//a[@id='menu_admin_Job']/following-sibling::ul/li/a")
	List<WebElement> listOfJobItems;

	@FindBy(xpath = "//h1")
	WebElement dataTable;

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

	public void verifyJobSubMenuItems(List<String> listOfItems) {
		for (int i = 0; i < listOfItems.size(); i++) {
			String actItem = listOfJobItems.get(i).getText();
			String expItem = listOfItems.get(i);
			Assert.assertTrue("Expected: " + expItem + "  Actual:" + actItem, actItem.equals(expItem));
		}
	}

	public void verifyDatatablesHomePage() {
		commonMethods.waitForElementToBeVisible(dataTable);
		Assert.assertTrue("Datatable homepage is not displayed", dataTable.isDisplayed());
	}

	public void verifyDatatablesData(List<List<String>> listOfItems) {
		String rowDataXpath = "//table[@id='example']/tbody/tr[%s]/td[not(contains(@style,'none'))]";

		for (int i = 0; i < listOfItems.size(); i++) {
			String finalLoc = String.format(rowDataXpath, i+1);
			List<WebElement> rowDataList = driver.findElements(By.xpath(finalLoc));
			for (int j = 0; j < listOfItems.get(i).size(); j++) {
				String expItem = listOfItems.get(i).get(j); // Feature / Excel / Database
				String actItem = rowDataList.get(j).getText();
				Assert.assertTrue("Expected: " + expItem + "  Actual:" + actItem, actItem.equals(expItem));
			}
		}
	}

	public void verifyDatatablesDataUsingHeader(List<Map<String, String>> listOfMap) {
		for (int i = 0; i < listOfMap.size(); i++) {
			System.out.println(listOfMap.get(i).get("Name"));
			System.out.println(listOfMap.get(i).get("Position"));
			System.out.println(listOfMap.get(i).get("Office"));
			System.out.println(listOfMap.get(i).get("age"));
			System.out.println(listOfMap.get(i).get("Start date"));
		}
	}

}
