@Regression
Feature: User should be able to create successful order
  Scenario: User create successful order
    Given Insert product name to order
    When User click on search button
    And Open product details page to order
    Then Add product to shopping Cart
    And Go to Shopping cart page
    Then Product added to Shopping Cart to do an order
    And Open checkout page
    And Add user details
    Then Product added in checkout page
    And User confirm order
    Then Order confirmed
    And user view order details
    Then Order added to order details page