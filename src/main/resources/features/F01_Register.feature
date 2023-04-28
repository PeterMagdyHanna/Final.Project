@smoke
Feature: F01_Register | could create new accounts by registering

  Scenario: guest user could register with valid data successfully
    Given I go to register page
    And I select gender type
    And I enter first name
    And I enter last name
    And I enter date of birth
    And I enter email
    And I fills Password fields
    When I click on register button
    Then success message is displayed