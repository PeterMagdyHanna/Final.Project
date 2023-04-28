@smoke
Feature: F03_currencies | Users have a variety of currencies to pick from

  Scenario: User can choose Euro currency
    When I click on dropdown list of currencies and select Euro currency
    Then Euro Symbol is shown
