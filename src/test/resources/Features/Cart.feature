@LoginPage
Feature: CucumberJava

  @AddToCart
  Scenario: Verify that the user can add a product to the cart
    Given User has opened the browser
    And User has logged in with valid username uzah123 and password password
    And User has navigated to a product page
    When User clicks the Add to cart button
    And User clicks the cart link
    Then The product should be added to the cart

  @DeleteFromCart
  Scenario: Verify that the user can delete a product from the cart
    Given User has opened the browser
    And User has logged in with valid username uzah123 and password password
    And User has navigated to a product page
    And User has clicked the Add to cart button
    And User has clicked the cart link
    When User clicks the Delete button
    Then The product should be deleted from the cart

  @PlaceOrder
  Scenario: Verify that the user can place an order
    Given User has opened the browser
    And User has logged in with valid username uzah123 and password password
    And User has navigated to a product page
    And User has clicked the Add to cart button
    And User has clicked the cart link
    When User clicks the Place Order button
    And User enters Harry, Nepal, Kathmandu, 211112223334445, February, 2024 in the name, country, city credit card, month, and year fields respectively
    And User clicks the Purchase button
    Then User should get a thank you message
