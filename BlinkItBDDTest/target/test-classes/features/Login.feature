@Test
Feature: As a user I want to login so that I can purchase

  @valaidLogin
  Scenario: Verify the user is able to login with valid login
  
    Given I launch the website "BlinkIt"
    When I click on login 
    And I give the valid login credentials "7904654159" and click login
    Then I should be logged in to the web site

  @invalidOTPLogin
  Scenario: Verify the user should not be able to login with invalid login
  
    Given I launch the website "BlinkIt"
    When I click on login 
    And I give the valid login credentials "7904654159" and invalid OTP and click login
    Then I should not be able to login to the web site
 