Feature: Feature to check login functionality

  @RegressionTest
  Scenario:
    Given user is on Login Page
    When user enters valid username and password
    And clicks on Login Button
    Then user is navigated to Home Page

  @RegressionTest
  Scenario:
    Given user is on Login Page
    When user enters valid username and password
    And clicks on Login Button
    Then user is navigated to Home Page