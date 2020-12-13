@TwitterRegression
Feature: Login page

  Scenario: Check login to account
    Given I navigate to Login page
    And I'm on Login page
    When I login to account
    Then I'm on Home page

  @t
  Scenario: Check login to account
    Given I navigate to Home page
    And I'm on Login page

