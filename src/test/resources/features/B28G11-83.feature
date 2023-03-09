@US83
Feature: Chat and calls module

  Background:
    Given user is on the login page
    When user logs in as "Human Resource"
    Then user should land on the dashboard page

  Scenario: User clicks Chat and Calls module and sees four sub-modules
    When User clicks on the Chat and Calls module
    Then User should see 4 sub-modules displayed