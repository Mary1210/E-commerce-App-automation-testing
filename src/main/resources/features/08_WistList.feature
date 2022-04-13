@Regression
Feature: User should be able to add product to wish list
  Scenario: User add product to wish list
    Given Insert product name to wist list
    When User click on search button
    And Open product details page for wish list
    Then Add product to wish list
    And Go to wist list page
    Then Product added to wist list