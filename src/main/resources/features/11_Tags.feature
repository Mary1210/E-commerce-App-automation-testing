@Regression
Feature: User should be able to select different tags
  Scenario: User select different tags
    Given Open category page
    When User click on tag
    Then Tagged product page open
    And User click on another tag
    Then Another tagged product page open