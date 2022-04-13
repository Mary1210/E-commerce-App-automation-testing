@Regression
Feature: User should be able to login to the system
  Scenario: User login with valid name and password
    Given Open login Page
    When User enter valid username and password
    And User click on login button
    Then User could login successfully
    And User click on logout button
    Then User could logout successfully

  Scenario: User ForgetPassword
    Given Open login Page
    When Click on forget Password
    And User write E-mail
    Then Email sent successfully to retrieve password


