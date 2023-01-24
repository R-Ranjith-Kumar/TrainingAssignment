package com.page.objects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.AutomationBase;
import com.utilities.Utility;

public class HomePage extends Utility{

	public HomePage(WebDriver driverInstance){
		PageFactory.initElements(driverInstance, this);
		driver=driverInstance;
	}
	
	public static void launchApp(String website) throws Exception {
        AutomationBase.launchApp(getAppUrl(website));
        logger.info("BlinkIt website is launched");
    }
	public static void selectLocation(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		clickElement(PageObjects.detectLocation);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		boolean locationCheck=true;
		try {
			isDisplayed(PageObjects.bengaluru);
		}
		catch (Exception e) {
			locationCheck=false;
		}
		if(locationCheck) {
			clickElement(returnElement(PageObjects.bengaluru, "clickable"));
			wait.until(ExpectedConditions.textToBePresentInElement(PageObjects.locationCheck1, "Delivery"));
		}
		else {
			wait.until(ExpectedConditions.textToBePresentInElement(PageObjects.locationCheck2, "MRW2+7WR, Ganesh Nagar Chikhali, Chikhali, Vitthal Nagar, Maharashtra 411062, India"));
		}
	}
	
	
}
