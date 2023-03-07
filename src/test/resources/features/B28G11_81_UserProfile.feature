Feature: User Profile Functionality
  User Story : As a user I should be able to see all the options under the user profile

  Background: User logged in successfully
    Given user is on the login page
    When user enters "helpdesk1@cybertekschool.com" in login field
    And user enters "UserUser" in password field
    And user clicks login button
    Then user should land on the dashboard page



  @B28G11_81
  Scenario: user profile five options verifications

    When click on the user profile
    Then User should be able to see My Profile options
    Then User should be able to see Edit Profile Settings options
    Then User should be able to see Themes options
    Then User should be able to see Configure notifications options
    Then User should be able to see Log out options