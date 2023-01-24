@Test
Feature: As a user I want to use cart features

  @AddToCart
  Scenario Outline: Verify the user is able to add an item to the cart
  
    Given I launch the website "BlinkIt"
    And I search a product '<product>'
    When I add the '<item>' to the cart
    Then I should be able to see the product '<item>' in the cart
	Examples: 
      | product  |item|
      | sugar free gold sweetener |Sugar Free Gold Sweetener|
      |Kissan Mixed Fruit Jam|Kissan Mixed Fruit Jam|
      
@RemoveItem
  Scenario Outline: Verify the user is able to remove a item to the cart
  
    Given I launch the website "BlinkIt"
    And I search a product '<product>'
    And I add the '<item>' to the cart
    When I remove the item '<item>' fron the cart
    Then the item '<item>' should be removed from the cart
	Examples: 
      | product  |item|
      | sugar free gold sweetener |Sugar Free Gold Sweetener|
      |Kissan Mixed Fruit Jam|Kissan Mixed Fruit Jam|
      
@EmptyCart
	Scenario: Verify the user is able to see empty cart if no item is added
  
    Given I launch the website "BlinkIt"
    When I click the cart
    Then I should be able to see the message "You don't have any items in your cart"
    
@Checkout
  Scenario Outline: Verify the user is able to proceed to checkout
  
    Given I launch the website "BlinkIt"
 		And I click on login 
    And I give the valid login credentials "7904654159" and click login    
    And I search a product '<product>'
    And I add the '<item>' to the cart
    When I proceed to checkout after selecting address 
    Then I should be see the payment page
	Examples: 
      | product  |item|
      |Kissan Mixed Fruit Jam|Kissan Mixed Fruit Jam|
      
@IncreaseItem
  Scenario Outline: Verify the user is able to increase item to the cart
  
    Given I launch the website "BlinkIt"
    And I search a product '<product>'
    And I add the '<item>' to the cart
    When I increase the '<item>' in the cart
    Then the quantity of the '<item>' should be increased
	Examples: 
      | product  |item|
      |Kissan Mixed Fruit Jam|Kissan Mixed Fruit Jam|
@DecreaseItem
  Scenario Outline: Verify the user is able to decrease item to the cart
  
    Given I launch the website "BlinkIt"
    And I search a product '<product>'
    And I add the '<item>' to the cart
    When I decrease the '<item>' in the cart
    Then the quantity of the '<item>' should be decreased
	Examples: 
      | product  |item|
      |Kissan Mixed Fruit Jam|Kissan Mixed Fruit Jam|