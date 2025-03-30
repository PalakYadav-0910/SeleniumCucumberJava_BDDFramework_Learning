Feature: Feature to check Home Page Functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on Login Button
    Then user is navigated to Home Page

  Scenario: Check Logount Link
    When user clicks on his profile icon
    Then logout link is displayed

  Scenario: Verify Quick Launch Toolbar is present
    When user clicks on dashboard
    Then quick launch toolbar is displayed