Feature: Login Feature
  
  Developer - Chirag
  Tester   - Yusuf

  Background: 
    Given user open website
    Then verify user is on login page

  @smoke @chirag
  Scenario: Verify Login Successful With Valid Credentials
    When user login with username "login.username" and password "login.password"
    And verify user is navigated to homepage

  @regression @inna
  Scenario: Verify Error Message For Forget Password Incorrect User
    When user click on forget password link
    Then verify user is on forget password page
    When user enter invalid username on forget password page
    And click on reset password button
    Then verify invalid username error message is displayed on forget password page

  @regression @yusuf
  Scenario Outline: Verify Login Unsuccessful With Invalid Credentials
    When user login with invalid credential username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

    Examples: 
      | username | password |
      | demo     | test     |
      | admin    | test@123 |
      | test     | admin123 |
      |          |          |
      
      
      
      
      
      
      
      
      
      
      
