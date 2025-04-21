Feature: Validate login attempt limit
  Scenario: Validate the limit of failed login attempts
    Given the user is on the login page
    When the user enters invalid credentials three times
    Then the system records three failed attempts
    When the user tries to login again
    Then the system temporarily locks the account and displays a lockout message