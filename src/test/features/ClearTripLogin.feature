Feature: ClearTrip login functionality

  Scenario: Logging in with invalid credentials should show an error
    Given I am on cleartrip login page
    When I enter invalid credentials
    Then I should see a error message