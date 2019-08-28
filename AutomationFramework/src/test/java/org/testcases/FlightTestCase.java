package org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlightTestCase 
{

	@Test
	public void createLogin() 
	{
		System.setProperty("webdriver.chrome.driver", "../AutomationFramework/browserexex/chromedriver");
		WebDriver driver = new ChromeDriver();// Opening the Chrome Browser
		Reporter.log("Opened new Chrome Browser");
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		// Command to enter url in current browser
		Reporter.log("Taking screen shot of  Chrome Browser");
		// Click on the Element
		driver.findElement(By.linkText("REGISTER")).click();
		// Type some text in User Name field
		driver.findElement(By.id("email")).sendKeys("sele12345s");
		
		
	}
	
	
	
	
}
