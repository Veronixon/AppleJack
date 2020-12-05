Feature: Login page

  Scenario: Check login to account
    Given I open browser
    And I navigate to Login page
    And I'm on login page
    When I login to account
    Then I'm on Home page