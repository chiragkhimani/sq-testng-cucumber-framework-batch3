@web
Feature: Add Candidate Feature
  
  Developer - Chirag
  Tester   - Yusuf

  Background: 
    Given user open website
    Then verify user is on login page
    When user login with username "admin" and password "admin123"
    And verify user is navigated to homepage

  @addCandidate
  Scenario: Verify user can able to add new user
    When user select Candidates tab from Recruitment menu
    Then verify user is on candidate listing page
    When user click on add button on candidate listing page
    Then verify user is on add candidate page
    When user fill required candidate details
    And upload resume file
    And click on save button on add candidate page
    Then verify success message is displayed
