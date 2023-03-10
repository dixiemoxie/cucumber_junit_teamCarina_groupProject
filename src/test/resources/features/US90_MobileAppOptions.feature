@US90
Feature: Mobile Application Options Visibility

  Background:
    Given user is on the login page
    When user logs in as "Human Resource"
    Then user should land on the dashboard page

  Scenario: Verify user see MOBILE APPLICATION APP STORE option
    And user scrolls down the page to MOBILE APPLICATION APP STORE element
    Then user should see APP STORE option under MOBILE APPLICATION

  Scenario: Verify user see MOBILE APPLICATION GOOGLE PLAY option
    And user scrolls down the page to MOBILE APPLICATION GOOGLE PLAY element
    Then user should see GOOGLE PLAY option under MOBILE APPLICATION