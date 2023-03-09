@US83
Feature: Chat and calls module

  Background:
    Given user is on the login page
    When user logs in as "Human Resource"
    Then user should land on the dashboard page

  Scenario: User clicks Chat and Calls module and sees four sub-modules
    When User clicks on the Chat and Calls module
    Then User should see 4 sub-modules displayed
    Then User should see message menu
    Then User should see notifications menu
    Then User should see setting menu
    Then User should see active stream menu