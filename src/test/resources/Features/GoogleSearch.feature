# Author - Palak Yadav
# Date - 23/03/2025
# Description - Test the Google Search Functionality

Feature: Feature to test Google Search Functionality

  @SmokeTest
  Scenario: Validate Google Search is working

    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results