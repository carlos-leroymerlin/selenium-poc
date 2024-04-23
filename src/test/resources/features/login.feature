@Regression
Feature: testing login page

  Background:
    Given I am in login page

  Scenario Outline: Test login with correct users
    When I introduce <user> and correct password
    Then I verify I logged in

    Examples: Correct users
      | user                    |
      | standard_user           |
      | performance_glitch_user |

  Scenario Outline: Test negative login
    When I introduce <user> and incorrect <password>
    Then I verify I not logged in

    Examples: Incorrect password
      | user                    | password |
      | standard_user           | 12345    |
      | performance_glitch_user | test123! |
