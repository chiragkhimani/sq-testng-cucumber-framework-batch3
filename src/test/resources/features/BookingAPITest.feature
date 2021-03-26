@api
Feature: API Test For Rest Booker
  
  Developer - Chirag
  Tester   - Yusuf

  @smoke @chirag
  Scenario: Verify Response code for get booking api
    Given user set up request for booking api
    When user perform get the request
    Then verify response code is 200

  @smoke @chirag
  Scenario: Verify Response code for create booking api
    Given user set up request for booking api
    And set header "Content-Type" value "application/json"
    And set request body for create booking api
    When user perform post the request
    Then verify response code is 200

  @smoke @chirag
  Scenario: Verify user can update the booking
    Given user set up request for auth api
    And set header "Content-Type" value "application/json"
    And set request body for auth api
    When user perform post the request
    Then verify response code is 200
    And save token value from response
    When user set up request for update booking api
    And set header "Content-Type" value "application/json"
    And set header "Accept" value "application/json"
    And set token value for update booking api
    And set request body for create booking api
    When user perform put the request
    Then verify response code is 200

  Scenario: Verify Response code for ping api
    Given user set up request for ping api
    When user perform get the request
    Then verify response code is 201

  Scenario: Verify Response code for single user get reqres api
    Given user set up request for single user get reqres api
    When user perform get the request
    Then verify response code is 200
