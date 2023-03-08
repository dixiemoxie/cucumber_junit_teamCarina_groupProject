Feature: Company Page functionality
  Agile Story: As a user I should be able to access to the Company page

  Background:
    Given user is on the login page
    When user enters username
   And user enters password
   Then user clicks login button

  @wip
  Scenario Outline: User inspect Company page
    Given user is on the home page
    When user clicks Company module
    Then user verifies if "<module>" is displayed

    Examples:
      | module               |
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Business News (RSS)  |
      | Career               |