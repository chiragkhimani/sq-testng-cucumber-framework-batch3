package com.automation.stepdef;

import java.util.List;
import java.util.Map;

import com.automation.page.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	HomePage homePage = new HomePage(DriverUtils.getDriver());

	@Then("verify user is navigated to homepage")
	public void verify_user_is_navigated_to_homepage() {
		homePage.validateHomePage();
	}

	@When("user selects user menu from Admin tab")
	public void user_selects_user_menu_from_admin_tab() {
		homePage.selectUsersMenu();
	}

	@When("user select Candidates tab from Recruitment menu")
	public void user_select_candidates_tab_from_recruitment_menu() {
		homePage.selectCandiateTab();
	}

	@Then("verify Job sub menu items has following data")
	public void verify_job_sub_menu_items_has_following_data(DataTable dataTable) {
		List<String> listOfItems = dataTable.asList();
		homePage.verifyJobSubMenuItems(listOfItems);
	}

	@Then("verify user is on datatables home page")
	public void verify_user_is_on_datatables_home_page() {
		homePage.verifyDatatablesHomePage();
	}

	@Then("verify data tables has following data")
	public void verify_data_tables_has_following_data(DataTable dataTable) {
		List<List<String>> listOfItems = dataTable.asLists();
		homePage.verifyDatatablesData(listOfItems);

	}
	
	@Then("verify data tables has following data using header")
	public void verify_data_tables_has_following_data_using_header(DataTable dataTable) {
		 List<Map<String, String>> listOfMap = dataTable.asMaps();
		homePage.verifyDatatablesDataUsingHeader(listOfMap);

	}
	
	

}
