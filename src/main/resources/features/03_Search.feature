@Regression
Feature: User should be able to search for any product
  Scenario: User search for any product to search
    Given Open login Page
    When User enter valid username and password
    And User click on login button
    And Insert product name to search
    Then User click on search button
    And Open product details page
    Then Product details page opens successfully
