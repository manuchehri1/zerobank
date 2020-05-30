#Automate login functionality
#Login.feature
#Write scenarios based on the given functionality and automate them in new feature
#file Login.feature.
#• Only authorized users should be able to login to the application. When user
#logs in with valid credentials, Account summary page should be displayed.
#• Users with wrong username or wrong password should not be able to login.
#Users with blank username or password should also not be able to login.
#When user tries to login with invalid information, error message Login and/or
#password are wrong. should be displayed.

Feature: User should be able to login

  Scenario: login with valid credentials
    Given when user is on the login page
    When user logins as an authorized user
    Then verify title is "Zero - Account Summary"

    @negativeLogin
  Scenario Outline: login with invalid credentials
    Given when user is on the login page
    When user logins with "<username>" and "<password>"
    Then user should see the "Login and/or password are wrong." error message

    Examples:
      |username|password|
      | worng       |      wrong        |
      |      username       |           |
      |                     |    password       |
      |                     |                   |
