package com.page.objects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utilities.AutomationBase;
import com.utilities.Utility;

public class SearchPage extends Utility{

	public SearchPage(WebDriver driverInstance) {
		driver=driverInstance;
	}
	
	public static void searchProduct(String product) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		sendKeys(returnElement(PageObjects.searchProductBox, "clickable"), product);
//		PageObjects.searchProductBox.sendKeys(Keys.ENTER);
		AutomationBase.pressEnter();
//		Thread.sleep(3000);
	}
	
	public static void checkValidProduct(String product) {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		List <WebElement> productAvailable=driver.findElements(By.xpath("//*[contains(text(),\"" +product+"\")]"));
//		System.out.println(productAvailable.size());
		returnElement(productAvailable.get(1), "visible");
		boolean result=(productAvailable.size()>1)?true:false;
		Assert.assertTrue(result);
	}
	
	public static void checkInvalidProduct() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		boolean result=(isDisplayed(PageObjects.errorMessageNoProduct))?true:false;
		Assert.assertTrue(result);
	}
}
