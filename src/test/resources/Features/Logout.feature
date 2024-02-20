@HomePage
Feature: CucumberJava

  @LogOut
  Scenario: Verify that the user can log out
    Given User has opened the browser
    And User has logged in with valid username uzah123 and password password
    When User clicks the log out link in the navigation bar
    Then User should be logged out
