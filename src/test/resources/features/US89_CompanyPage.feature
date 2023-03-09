@us89
Feature: Company Page functionality
  Agile Story: As a user I should be able to access to the Company page

  Background:
    Given user is on the login page
    When user logs in as "Human Resource"
    Then user should land on the dashboard page


  Scenario: User inspect Company page
    When user clicks Company module
    Then user verifies if WebElements are displayed

      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Business News (RSS)  |
      | Career               |
