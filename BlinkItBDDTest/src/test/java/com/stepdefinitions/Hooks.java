package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.page.objects.HomePage;
import com.page.objects.LoginPage;
import com.page.objects.PageObjects;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	static WebDriver driver;

    @Before("@Test")
    public void before_launchBrowser(Scenario scenario) {
        if (System.getProperty("browser") == null) {
            String path = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", path+"\\src\\test\\resources\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
//            ChromeOptions options = new ChromeOptions();
//            options.setBinary(new File("/usr/bin/google-chrome"));
//            driver = new ChromeDriver(options);
        } else {
            switch (System.getProperty("browser")) {
                case "Chrome":
                    String path = System.getProperty("user.dir");
                    System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\chromedriver.exe");
                    //WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "IE":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        initPageDrivers(driver);
        driver.manage().window().maximize();
    }

    public static void initPageDrivers(WebDriver driver) {
        new AutomationBase(driver);
        new PageObjects(driver);
        new HomePage(driver);
        new Utility(driver);
        new LoginPage(driver);
    }

    @After("@Test")
    public void after_quitBrowser(Scenario scenario) {
        if (scenario.isFailed() && driver != null) {
            byte[] data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
            driver.quit();
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
