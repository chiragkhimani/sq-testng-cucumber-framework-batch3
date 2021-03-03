package com.automation.test;

import org.testng.annotations.Test;

import com.automation.utils.PropertyReader;

public class AddUserTest extends BaseTest {

	@Test
	public void addUserFunctionalityTest() {
		loginPage.openWebsite();
		loginPage.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
		homePage.validateHomePage();
		homePage.selectUsersMenu();
		userListingPage.clickOnAddBtn();
		addUserPage.fillRequiredUserDetails();
		addUserPage.clickOnSaveBtn();
		userListingPage.validateAddUserSuccessMsg();
	}

}
