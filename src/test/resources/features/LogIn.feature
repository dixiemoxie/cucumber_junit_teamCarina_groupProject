@loginfunctionality
Feature: Login Functionality
  #Feature: Coincides with Epic/feature/functionality
  #Agile Story: As a user I should be able to login with valid credentials
  #and land on the user dashboard page



  Scenario Outline: As a user I should be able to login with valid credentials
  and land on the user dashboard page
    Given user is on the login page
    When user enters "<validusername>" in login field
    And user enters "<validpassword>" in password field
    And user clicks login button
    Then user should land on the dashboard page

    Examples:
      | validusername                  | validpassword |
      | helpdesk1@cybertekschool.com   | UserUser      |
      | helpdesk22@cybertekschool.com  | UserUser      |
      | hr1@cybertekschool.com         | UserUser      |
      | hr22@cybertekschool.com        | UserUser      |
      | marketing1@cybertekschool.com  | UserUser      |
      | marketing22@cybertekschool.com | UserUser      |


  Scenario Outline: As a user I should see error message when logging
  in with invalid credentials
    Given user is on the login page
    When user enters "<invalidusername>" in log-in field
    And user enters "<invalidpassword>" in pass-word field
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



