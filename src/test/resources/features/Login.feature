Feature: We are testing login functionality in this feature
  
  Developer - Chirag
  Tester   - Yusuf

  Scenario: Verify Login Successful With Valid Credentials
    Given user open website
    Then verify user is on login page
    When user enters valid credentials
    And user clicks on login button
    Then verify user is not on login page
    And verify user is navigated to homepage
