
  Feature: Configure Menu Options Visibility

    Background: User logged in successfully
      Given user is on the login page
      When user enters "helpdesk1@cybertekschool.com" in login field
      And user enters "UserUser" in password field
      And user clicks login button
      Then user should land on the dashboard page

    @US88
      Scenario: As a user I should be able to configure the menu
      When the user is on the home page
      And clicks Configure Menu button
      Then user should see Configure Menu Items
      Then user should see Collapse menu
      Then user should see Remove current page from left menu
      Then user should see Add custom menu item
      Then user should see Change primary tool
      Then user should see Reset menu
