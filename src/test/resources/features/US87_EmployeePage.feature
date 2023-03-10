@US87
Feature: Employees Page Accessibility

  Background:
    Given user is on the login page
    When user logs in as "Human Resource"
    Then user should land on the dashboard page

  Scenario: Verify user has access to Employees Page
    When user clicks on the employees button
    Then user should see all modules in the employees page