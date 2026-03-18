Feature: Login functionality

  Scenario: Valid login
    Given user is on login page
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And clicks login button
    Then user should be navigated to home page