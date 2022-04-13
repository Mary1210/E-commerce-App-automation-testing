@Regression
Feature: User should be able to compare products
  Scenario: User compare between products
    Given Insert first product name to compare
    When User click on search button
    And Open product details page for first product
    Then Add product to compare
    And Insert second product name to compare
    Then User click on search button
    And Open product details page for second product
    Then Add product to compare
    And Go to compare page
    Then Products added to compare page
