@TwitterRegression
Feature: Login page

  Scenario: Check login to account
    Given I navigate to Login page
    And I'm on Login page
    When I login to account as "USER_1"
    Then I'm on Home page

