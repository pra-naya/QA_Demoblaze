@HomePage
Feature: CucumberJava

  @ValidCredentials
  Scenario: Verify if the valid username and password is entered then user should be logged in
    Given User has opened the browser
    When User opens the website
    And User clicks the Log in link in the navigation bar
    And User enters valid username uzah123 and password password
    And User clicks the login button
    Then User should be logged in


  @InvalidCredentials
  Scenario: Verify that the user inputs valid email and wrong password (output should be error message)
    Given User has opened the browser
    When User opens the website
    And User clicks the Log in link in the navigation bar
    And User enters invalid username user and wrong password pass
    And User clicks the login button
    Then User should not be logged in