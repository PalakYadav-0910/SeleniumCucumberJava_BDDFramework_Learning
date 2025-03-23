# Author - Palak Yadav
# Date - 23/03/2025
# Description - Test the Login Functionality with saucedemo website


Feature: Feature to test Login Functionality with Sauce Demo Website

  @SmokeTest
  Scenario: Verify Login is successful with valid credentials
    Given browser is open
    And user is on Login Page
    When user enters username and password
    And user clicks on Login Button
    Then user is navigated to Home Page