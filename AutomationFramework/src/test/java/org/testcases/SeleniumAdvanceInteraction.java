package org.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SeleniumAdvanceInteraction 

{
	@Test (enabled =false)
	public void mouseInteraction() 
	{
		//System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();// Opening the Chrome Browser
		Reporter.log("Opened new Chrome Browser");
		driver.get("https://www.amazon.in/");
		
		WebElement selectCatMenu = driver.findElement(By.id("nav-link-shopall"));
		
		
		// For mouse movement in Selenium
		
		Actions mouseAct = new Actions(driver);
		
		//mouseAct.contextClick() // Contextclick() for right click on web element
		
		// moveToElemetn method hover to webElement
		mouseAct.moveToElement(selectCatMenu).build().perform();
		
		WebElement alexaOption = driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[1]/span"));
		
		// Sub menu mouse hover
		Actions mouseAct1 = new Actions(driver);
		 mouseAct1.moveToElement(alexaOption).build().perform();
		 
		 //To do-- write step to click in any option of sub menu
		
		
		
		
		
		
		
		
	}
	
	@Test (enabled =false)
	public void handleJavaScriptAlert()
	{ //System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();// Opening the Chrome Browser
		Reporter.log("Opened new Chrome Browser");
		driver.get("https://www.xul.fr/javascript/alert.php");
		
		// Implicit wait -- applies to driver 
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//driver will wait max 40 sec to perofrm action
		//if it can do before 40 sec it will do
		// mean to say timeout will occure at 40 sec not before
		
		WebElement sendButton = driver.findElement(By.name("button"));
		sendButton.click();
		
		// returns the text message which shown in alert
		 String txtInAlert =driver.switchTo().alert().getText();
		System.out.println(" the text from alert is "+txtInAlert);
		
		// dismiss will click on cencle /esc/ or close the alert
		//driver.switchTo().alert().dismiss();
		
		
		// accept method will click on OK/Yes or any confirmation
		driver.switchTo().alert().accept();
				
		
		
		
	}

	@Test
	public void scrollPageInselenium()
	{
	
		WebDriver driver = new ChromeDriver();// Opening the Chrome Browser
		Reporter.log("Opened new Chrome Browser");
		driver.get("https://www.xul.fr/javascript/alert.php");
		
		// Scroll page down vertically
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// window.scrollBy(0,"px down vertically")
		jse.executeScript("window.scrollBy(0,500)", "");
		
		
		// Scroll horizonally
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//window.scrollBy(px to scroll horizonataly,0)
		//jse.executeScript("window.scrollBy(300,50)", "");
		
		
		
	}
	
	
}
