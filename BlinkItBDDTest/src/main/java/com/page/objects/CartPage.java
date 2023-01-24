package com.page.objects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Utility;

public class CartPage extends Utility{

	public CartPage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver=driverInstance;
	}
	
	public static WebElement itemAdd,itemRemoveButton,increaseItemButton,decreaseItemButton,numberOfItemsButton;
	public static List<WebElement>itemPresent;
	public static int itemsBeforeChange, itemsAfterChange;
	public static void addItem(String itemtext) {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		itemAdd=driver.findElement(By.xpath("//*[contains(text(),\""+itemtext+"\")]//parent::div//descendant::div[@class=\"AddToCart__ButtonWrapper-sc-17ig0e3-0 cdxXEt\"]"));
		clickElement(returnElement(itemAdd, "clickable"));
	}
	
	public static void openCart() {
		clickElement(PageObjects.cartButton);
	}
	public static void checkIfItemAdded(String itemText) {
		itemPresent=driver.findElements(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]"));
		boolean result=(itemPresent.size()>0)?true:false;
		Assert.assertTrue(result);
	}
	
	public static void removeItem(String itemText) throws InterruptedException {
		itemRemoveButton=driver.findElement(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]//following::div[@class=\"AddToCart__AddMinusIcon-sc-17ig0e3-7 pwvGx\"]"));
		clickElement(itemRemoveButton);
	}
	
	public static void checkIfItemRemoved(String itemText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		itemPresent=driver.findElements(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]"));
		wait.until(ExpectedConditions.invisibilityOf(itemPresent.get(0)));
		boolean result=false;
		try{
			isDisplayed(itemPresent.get(0));
		}
		catch(Exception e) {
			result =true;
		}
		Assert.assertTrue(result);
	}
	
	public static void checkIfCartIsEmpty() {
		boolean result=false;
		try {
			result=isDisplayed(returnElement(PageObjects.emptyCartMessage, "visibility"));
		}
		catch(Exception e) {
			result=false;
		}
		Assert.assertTrue(result);
	}
	
	public static void proceedToCheckout() {
		clickElement(PageObjects.proceedtoCheckoutButton);
		clickElement(PageObjects.addressSelectionButton);
		clickElement(PageObjects.doneAfterAddressSelection);
		clickElement(PageObjects.proceedtoCheckoutButton);

	}

	public static void checkIfProceededToCheckOut() {
		boolean result;
		try {
			result=isDisplayed(PageObjects.paymentCheck);
		}
		catch(Exception e) {
			result=false;
		}
		Assert.assertTrue(result);
	}
	
	public static void increaseItem(String itemText) {
		numberOfItemsButton=driver.findElement(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]//following::div[@class=\"AddToCart__QuantityText-sc-17ig0e3-5 gRJgXt\"]"));
		itemsBeforeChange=Integer.parseInt(getText(returnElement(numberOfItemsButton, "visible")));
		increaseItemButton= driver.findElement(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]//following::div[@class=\"AddToCart__AddMinusIcon-sc-17ig0e3-7 jeezRB\"]"));
		clickElement(returnElement(increaseItemButton, "visible"));
	}
	
	public static void checkIfItemIncresed(String itemText) {
		numberOfItemsButton=driver.findElement(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]//following::div[@class=\"AddToCart__QuantityText-sc-17ig0e3-5 gRJgXt\"]"));
		itemsAfterChange=Integer.parseInt(getText(returnElement(numberOfItemsButton, "visible")));
		boolean result=(itemsBeforeChange==(itemsAfterChange-1));
		Assert.assertTrue(result);
	}
	
	public static void decreaseItem(String itemText) {
		numberOfItemsButton=driver.findElement(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]//following::div[@class=\"AddToCart__QuantityText-sc-17ig0e3-5 gRJgXt\"]"));
		itemsBeforeChange=Integer.parseInt(getText(returnElement(numberOfItemsButton, "visible")));
		decreaseItemButton= driver.findElement(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]//following::div[@class=\"AddToCart__AddMinusIcon-sc-17ig0e3-7 pwvGx\"]"));
		clickElement(returnElement(decreaseItemButton, "visible"));
	}
	public static void checkIfItemDecresed(String itemText) {
		numberOfItemsButton=driver.findElement(By.xpath("//*[@class=\"Cart__Title-sc-2rzauy-3 bcAuAz\"]//following::*[contains(text(),\""+itemText+"\")]//following::div[@class=\"AddToCart__QuantityText-sc-17ig0e3-5 gRJgXt\"]"));
		itemsAfterChange=Integer.parseInt(getText(returnElement(numberOfItemsButton, "visible")));
		boolean result=(itemsBeforeChange==(itemsAfterChange+1));
		Assert.assertTrue(result);
	}
	
}
