package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class PageObjects extends Utility{

	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver=driverInstance;
	}
	@FindBy(xpath="//button[@class=\"btn location-box mask-button\"]")
	public static WebElement detectLocation;
	
	@FindBy(xpath="//a[text()=\"Bengaluru\"]")
	public static WebElement bengaluru;
	
	@FindBy(xpath="//*[@class=\"LocationBar__Title-sc-x8ezho-8 dYIqdm\"]")
	public static WebElement locationCheck1;

	@FindBy(xpath="//*[@class=\"LocationBar__Subtitle-sc-x8ezho-10 bdWwbr\"]")
	public static WebElement locationCheck2;
	
	@FindBy(xpath="//div[@class=\"ProfileButton__Text-sc-975teb-2 bFHCDW\"]")
	public static WebElement loginButton;
	
	@FindBy(xpath="//input[@data-test-id=\"phone-no-text-box\"]")
	public static WebElement phoneNoTextBox;
	
	@FindBy(xpath="//button[@data-test-id=\"login-next-button\"]")
	public static WebElement nextAfterPhoneNumber;
	
	@FindBy(xpath="//button[@data-test-id=\"otp-next-button\"]")
	public static WebElement nextAfterOTP;
	
	@FindBy(xpath="//div[@data-test-id=\"modal-error\"]")
	public static WebElement OTPErrorMessage;
	
	@FindBy(xpath="//input[@class=\"react-autosuggest__input\"]")
	public static WebElement searchProductBox;
	
	@FindBy(xpath="//*[contains(text(),'Sorry! No matching results found')]")
	public static WebElement errorMessageNoProduct;
	
	@FindBy(xpath="//*[@class=\"CartButton__Button-sc-1fuy2nj-5 joEvaa\"]")
	public static WebElement cartButton;

	@FindBy(xpath="//*[contains(text(),\"you don't have any items in your cart\")]")
	public static WebElement emptyCartMessage;
	
	@FindBy(xpath="//*[@class=\"CheckoutStrip__PricingContainer-sc-1fzbdhy-3 jNMbUN\"]")
	public static WebElement proceedtoCheckoutButton;
	
	@FindBy(xpath="//*[@class=\"AddressDetails__Icon-sc-1kthw5k-4 jglHyc\"]")
	public static WebElement addressSelectionButton;

	@FindBy(xpath="//*[@class=\"Address__ButtonContainer-sc-1o1mdn6-2 kyXDiz\"]")
	public static WebElement doneAfterAddressSelection;

	@FindBy(xpath="//*[contains(text(),\"Select Payment Method\")]")
	public static WebElement paymentCheck;
	
	
	}
