@TwitterRegression
Feature: Login page

  Scenario: Check login to account
    Given I navigate to Login page
    And I'm on Login page
    When I login to account as "USER_1"
    Then I'm on Home page

  @MobileView
  Scenario Outline: Check login to account in mobile view
    Given I'm gonna use "<deviceName>" device
    And I navigate to Login page
    And I'm on Login page
    When I login to account as "USER_1"
    Then I'm on Home page
    Examples:
      | deviceName |
      | iPad       |
      | iPhone  X  |

