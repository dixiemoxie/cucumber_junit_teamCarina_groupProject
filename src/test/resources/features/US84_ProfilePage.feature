@B28G11-135
Feature: Profile Page Accessibility
  User Story: As a user, I want to access my profile page.

  Background:
    Given user is on the login page
    When user logs in as "Human Resource"
    Then user should land on the dashboard page

  @B28G11-134
  Scenario: Verify user has access to Profile Page
    When user clicks on user profile
    And clicks on my profile
    Then user should see all five options under the user profile
