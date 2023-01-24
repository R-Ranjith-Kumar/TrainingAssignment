package com.stepdefinitions;

import com.page.objects.CartPage;
import com.page.objects.HomePage;
import com.page.objects.LoginPage;
import com.page.objects.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("I launch the website {string}")
	public void i_launch_the_website(String string) throws Exception {
		HomePage.launchApp(string);
		HomePage.selectLocation();
	}

	@When("I click on login")
	public void i_click_on_login() {
		LoginPage.clickLogin();
	}

	@When("I give the valid login credentials {string} and click login")
	public void i_give_the_valid_login_credentials_and_click_login(String string) {
		LoginPage.loginToTheApp(string);
	}

	@Then("I should be logged in to the web site")
	public void i_should_be_logged_in_to_the_web_site() throws InterruptedException  {
			LoginPage.checkValidLogin();
	}
	
	@When("I give the valid login credentials {string} and invalid OTP and click login")
	public void i_give_the_valid_login_credentials_and_invalid_otp_and_click_login(String string) {
	    LoginPage.loginToTheApp(string);
	}


	@Then("I should not be able to login to the web site")
	public void i_should_not_be_able_to_login_to_the_web_site() throws InterruptedException {
	    LoginPage.checkWrongOTP();
	}
	
	@When("I search a product {string}")
	public void i_search_a_product(String string) throws InterruptedException {
	    SearchPage.searchProduct(string);

	}

	@Then("I should be able to see the product {string} in the result page")
	public void i_should_be_able_to_see_the_product_in_the_result_page(String string) throws InterruptedException {
		SearchPage.checkValidProduct(string);
	}

	@When("I search a invalid product {string}")
	public void i_search_a_invalid_product(String string) throws InterruptedException {
		SearchPage.searchProduct(string);
	}

	@Then("I should be able to see the error Message")
	public void i_should_be_able_to_see_the_error_message() {
		SearchPage.checkInvalidProduct();
	}
	
	@When("I add the {string} to the cart")
	public void i_add_the_to_the_cart(String string) {
	    CartPage.addItem(string);
	}

	@Then("I should be able to see the product {string} in the cart")
	public void i_should_be_able_to_see_the_product_in_the_cart(String string) {
	    CartPage.openCart();
	    CartPage.checkIfItemAdded(string);
	}
	
	@When("I remove the item {string} fron the cart")
	public void i_remove_the_item_fron_the_cart(String string) throws InterruptedException {
	    CartPage.openCart();
		CartPage.removeItem(string);
	}

	@Then("the item {string} should be removed from the cart")
	public void the_item_should_be_removed_from_the_cart(String string) {
		CartPage.checkIfItemRemoved(string);
	}

	@When("I click the cart")
	public void i_click_the_cart() {
	    CartPage.openCart();

	}
	@Then("I should be able to see the message {string}")
	public void i_should_be_able_to_see_the_message(String string) {
	    CartPage.checkIfCartIsEmpty();
	}
	
	@When("I proceed to checkout after selecting address")
	public void i_proceed_to_checkout_after_selecting_address() {
		CartPage.openCart();
		CartPage.proceedToCheckout();
	}
	@Then("I should be see the payment page")
	public void i_should_be_see_the_payment_page() {
	    CartPage.checkIfProceededToCheckOut();
	}
	
	@When("I increase the {string} in the cart")
	public void i_increase_the_in_the_cart(String string) {
	    CartPage.openCart();
	    CartPage.increaseItem(string);
	}
	@Then("the quantity of the {string} should be increased")
	public void the_quantity_of_the_should_be_increased(String string) {
		CartPage.checkIfItemIncresed(string);
	}

	@When("I decrease the {string} in the cart")
	public void i_decrease_the_in_the_cart(String string) {
		CartPage.openCart();
	    CartPage.increaseItem(string);
	    CartPage.decreaseItem(string);
	}
	@Then("the quantity of the {string} should be decreased")
	public void the_quantity_of_the_should_be_decreased(String string) {
		CartPage.checkIfItemDecresed(string);
	}





}
