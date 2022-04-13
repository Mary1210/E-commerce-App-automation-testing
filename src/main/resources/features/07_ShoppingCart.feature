@Regression
Feature: User should be able to add product to shopping cart
  Scenario: User add product to shopping cart
    Given Insert product name
    When User click on search button
    And Open product details page to shopping cart
    Then Add product to shopping Cart
    And Go to Shopping cart page
    Then Product added to Shopping Cart