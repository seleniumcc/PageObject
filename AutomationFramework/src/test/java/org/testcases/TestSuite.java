package org.testcases;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TestSuite {
	
	
	@Test(enabled = false)
	public void openBrowserAndApplication()
	{
		//System.setProperty("webdriver.chrome.driver", "pathofChromeDriver");
		WebDriver driver = new ChromeDriver();// Opening the Chrome Browser
		Reporter.log("Opened new Chrome Browser");
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		// Command to enter url in current browser
		Reporter.log("Loaded url Chrome Browser");
		String actualApplicationTitle =driver.getTitle();
		// Validation - comparison with actual to expected 
		// this comparison know as Assertion 
		/*if(actualApplicationTitle.equals("Welcome: Mercury Tours"))
		{
			Reporter.log("Application Opens successfully");
		}
		else
		{
			Reporter.log("Application not successfully");
			
		}*/
		Assert.assertEquals(actualApplicationTitle , "Welcome: Mercury Tours1");
		driver.close(); // command to close the current browser
		Reporter.log("closed Chrome Browser");
	}

	@Test(enabled = false)
	public void browserMxAndResiZe()
	{
		//System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Maximize the window
		
		
		Dimension dim = new Dimension(400,500);
		
		driver.manage().window().setSize(dim);//Set the window size to x=400 and y =500
				
		
		
	}
	
	@Test
	public void takeScreenShot() throws IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();// Opening the Chrome Browser
		Reporter.log("Opened new Chrome Browser");
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		// Command to enter url in current browser
		Reporter.log("Taking screen shot of  Chrome Browser");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
	// For Windows --	Files.copy(scrFile, new File("c:\\tmp\\screenshot.png"));
		//Mac follow below
		Files.copy(scrFile, new File("/Users/mukeshkumar/eclipse-workspace/AutomationFramework/screenShots/screenshot.png"));
		driver.close();
	}
	

	
	
	
	
	
}
