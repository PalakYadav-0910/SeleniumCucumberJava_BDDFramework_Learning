# Author - Palak Yadav
# Date - 23/03/2025
# Description - Test the Login Functionality

@SmokeScenario
Feature: Feature to test Login Functionality

  @SmokeTest
  Scenario: Check Login is successful with valid credentials
    Given user is on Login Page
    When user enters username and password
    And user clicks on Login Button
    Then user is navigated to Home Page

  Scenario Outline: Check Login is successfull with valid credentials
    Given user is on Login Page
    When user enters <username> and <password>
    And user clicks on Login Button
    Then user is navigated to Home Page

    Examples:
    |username|password|
    |user1   |pass1   |
    |user2   |pass2   |