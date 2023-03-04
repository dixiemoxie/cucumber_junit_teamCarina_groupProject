@US77
Feature: Login Functionality


  Background:
    Given user is on the login page

  Scenario: Verify login with valid credentials and land on the user dashboard page
    When user logs in as "Human Resource"
    Then user should land on the dashboard page




  Scenario Outline: Verify user sees error message when logging in with invalid credentials
    Given user is on the login page
    When user enters "<invalidusername>" in login field
    And user enters "<invalidpassword>" in password field
    And user clicks login button
    Then user should see error message

    Examples:
      | invalidusername               | invalidpassword |
      | elpdesk1@cybertekschool.com   | User            |
      | helpdesk22@cybertekschool.co  | UserU           |
      | r1@cybertekschool.com         | UserUs          |
      | hr22@cybertekschool.com       | UserUse         |
      | arketing1@cybertekschool.com  | UserUse         |
      | marketing22@cybertekschool.co | UserUse         |



