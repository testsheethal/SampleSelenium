package DemoSelenium.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class PassDemoSelenium {    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        WebDriver driver = null;
       
        @Test
        public void verifyHomepageTitlePassTestCase() {
             
            System.out.println("launching Chrome browser"); 
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\d.d\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
            driver.close();
        }
        
        @Test
        public void verifyFailTC() {
             
            System.out.println("launching Chrome browser"); 
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\d.d\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
            driver.findElement(By.name("null")).sendKeys("Test");
            driver.close();
        }
    }
