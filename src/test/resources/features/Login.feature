Feature: We are testing login functionality in this feature
  
  Developer - Chirag
  Tester   - Yusuf

  Scenario: Verify Login Successful With Valid Credentials
    Given user open website
    Then verify user is on login page
    When user login with valid credentials
    And verify user is navigated to homepage

  Scenario: Verify Login UnSuccessful WithIn Valid Credentials
    Given user open website
    Then verify user is on login page
    When user login with invalid credentials
    Then verify invalid login error message is displayed
	
  Scenario: Verify Error Message For Forget Password Incorrect User
    Given user open website
    When user click on forget password link
    Then verify user is on forget password page
    When user enter invalid username on forget password page
    And click on reset password button
    Then verify invalid username error message is displayed on forget password page
