@smokeCurrencies
Feature: F03_currencies | Users can choose from different currencies

  Scenario: User can choose Euro currency
    When I click on dropdown list of currencies and select Euro currency
    Then Euro Symbol is shown
