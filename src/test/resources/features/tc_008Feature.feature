Feature: Validate role-based access control

  Scenario: Validate access for a user with limited role
    Given the user with role "limited" logs into the system
    Then the system shows only functionalities allowed for "limited" role
    When the user attempts to access a restricted functionality
    Then the system denies access and displays an insufficient authorization message