@api
Feature: API Test For Rest Booker
  
  Developer - Chirag
  Tester   - Yusuf

  @smoke @chirag
  Scenario: Verify Response code for get booking api
    Given user set up request for get booking list api
    When user perform get the request
    Then verify response code is 200

  @smoke @chirag
  Scenario: Verify Response code for create booking api
    Given user set up request for create booking api
    And set header "Content-Type" value "application/json"
    And set request body for create booking api
    When user perform post the request
    Then verify response code is 200
