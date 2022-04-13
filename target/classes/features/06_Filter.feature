@Regression
Feature: User should be able to select category and sub categories
  Scenario: User select category and sub categories
    Given Click on Appreal category
    When User click on Shoes category
    Then Shoes page category page opens successfully
    And User select color filter
    Then Color filter selected