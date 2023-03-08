Feature: Time and reports page

  Background: User logged in successfully
    Given user is on the login page
    When user enters "helpdesk1@cybertekschool.com" in login field
    And user enters "UserUser" in password field
    And user clicks login button
    Then user should land on the dashboard page
  @B28G11_86
  Scenario: As a user I want to access "Time and Reports" page
    When user is on the home page
    And clicks Time and Reports on the left side of the page
    Then user should land on the correct page
    And see all the modules at the top of the page
