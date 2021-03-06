Feature: We are testing login functionality in this feature
  
  Developer - Chirag
  Tester   - Yusuf

  Background: 
    Given user open website
    Then verify user is on login page

  @smoke @chirag
  Scenario: Verify Login Successful With Valid Credentials
    When user login with valid credentials
    And verify user is navigated to homepage

  @regression @yusuf
  Scenario: Verify Login UnSuccessful WithIn Valid Credentials
    When user login with invalid credentials
    Then verify invalid login error message is displayed

  @regression @inna
  Scenario: Verify Error Message For Forget Password Incorrect User
    When user click on forget password link
    Then verify user is on forget password page
    When user enter invalid username on forget password page
    And click on reset password button
    Then verify invalid username error message is displayed on forget password page

  @smoke @rabia @wip
  Scenario: Verify Error Message For Blank Credential
    When user login with blank credentials
    Then verify invalid login error message is displayed
