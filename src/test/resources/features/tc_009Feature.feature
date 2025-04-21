Feature: Multi-Factor Authentication (MFA) validation

  Scenario: Validate MFA
    Given the user is on the login page
    When the user logs in with valid credentials
    Then the system requests a second factor of authentication
    When the user enters the code received in the second factor
    Then the system authenticates the user and allows access