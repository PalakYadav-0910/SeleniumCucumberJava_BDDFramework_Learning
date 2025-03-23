# Author - Palak Yadav
# Date - 23/03/2025
# Description - Test the Login Functionality for Nopcommerce Admin Website

Feature: Feature to test Login Functionality for Nopcommerce Admin Website

  @RegressionTest
  Scenario: Check Login is successful with valid credentials

    Given browser is open
    And user is on Login Page
    When user enters username and password
    And user clicks on Login Button
    Then user is navigated to Dashboard Page