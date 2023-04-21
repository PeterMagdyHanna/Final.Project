@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    Given I go to login page
    When I login with valid email and password
    And I press on login button
    Then I login to the system successfully

  Scenario: user could login with invalid email and password
    Given I go to login page
    When I login with invalid email and password
    And I press on login button
    Then I could not login to the system