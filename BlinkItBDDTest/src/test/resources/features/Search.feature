@Test
Feature: As a user I want to search a product so that I can purchase

  @valaidSearch
  Scenario Outline: Verify the user is able to search a product
  
    Given I launch the website "BlinkIt"
    When I search a product '<product>'
    Then I should be able to see the product '<product>' in the result page
	Examples: 
      |product|
      |Grocery 1kg Sugar|
      |Kissan Mixed Fruit Jam|
      
  @inValaidSearch
  Scenario Outline: Verify the user gets error message on invalid search
  
    Given I launch the website "BlinkIt"
    When I search a invalid product '<product>'
    Then I should be able to see the error Message
	Examples: 
      |product|
      | dlskfjkljlskjdlks |