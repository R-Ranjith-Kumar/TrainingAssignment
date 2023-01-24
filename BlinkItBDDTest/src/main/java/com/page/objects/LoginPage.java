package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utilities.Utility;

public class LoginPage extends Utility{

	public LoginPage(WebDriver driverInstance) {
		driver=driverInstance;
	}
	
	public static void clickLogin() {
		clickElement(returnElement(PageObjects.loginButton, "clickable"));
	}
	
	public static void loginToTheApp(String phone) {
		sendKeys(returnElement(PageObjects.phoneNoTextBox, "clickable"), phone);
		clickElement(returnElement(PageObjects.nextAfterPhoneNumber, "clickable"));
		clickElement(returnElement(PageObjects.nextAfterOTP, "clickable"));
		explicitWait(2);
	}
	
	public static void checkWrongOTP() throws InterruptedException {
		boolean result= false;
		if(isDisplayed(returnElement(PageObjects.OTPErrorMessage, "visible"))) {
			result=true;
		}
		Assert.assertEquals(result, true);
	}
	public static void checkValidLogin() throws InterruptedException {
		boolean result=false;
		if(getText(returnElement(PageObjects.loginButton, "clickable")).equalsIgnoreCase("account")) {
			result=true;
		}
		Assert.assertEquals(result, true);
	}
}
