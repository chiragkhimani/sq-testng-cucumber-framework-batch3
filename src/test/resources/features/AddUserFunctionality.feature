@web
Feature: We are testing add user functionality in this feature
  
  Developer - Chirag
  Tester   - Yusuf

  Background: 
    Given user open website
    Then verify user is on login page
    When user login with username "admin" and password "admin123"
    And verify user is navigated to homepage
    When user selects user menu from Admin tab

  @regression @Mehrona 
  Scenario: Verify user can able to add new user
    And click on add button
    And fill required user details on add user page
    And click on save button
    Then verify add user success message is displayed
	
	@regression @Tehran 
  Scenario: Verify error message for different confirm password
    And click on add button
    When user enters required user details with different confirm password
    Then verify confirm password error message is dispalyed

  @disabledField @Inna 
  Scenario: Verify fields disabled on add user page
    When user search with admin user
    And click on admin user link
    Then verify user is on user details page
    And verify all fields are disabled on user details page
