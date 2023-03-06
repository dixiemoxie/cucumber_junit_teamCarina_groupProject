Feature: Options to download

  Background: User logged in successfully
    Given user is on the login page
    When user enters "helpdesk1@cybertekschool.com" in login field
    And user enters "UserUser" in password field
    And user clicks login button
    Then user should land on the dashboard page
@B28G11_80
  Scenario: As a user I should be able to see desktop options to download

    When user is on the home page
    Then user sees Desktop client module on the right side of the page
