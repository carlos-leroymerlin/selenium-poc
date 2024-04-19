Feature: testing login page

  Scenario Template: Test login with correct users
    Given I am in login page
    When I introduce <user> and correct password
    Then I verify I logged in

    Examples: Correct users
      | user                    |
      | standard_user           |
      | performance_glitch_user |
