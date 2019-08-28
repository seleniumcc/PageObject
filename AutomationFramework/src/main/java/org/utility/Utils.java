package org.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utils {
	
	
	public static WebDriver driver = null;
	static String browsrName =Utils.getProperty("browserName", "env");
	
	public static void openBrowser() 
	{
		browsrName=browsrName.toLowerCase();
		if(browsrName.startsWith("c"))
		{
			System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
			WebDriver driver = new ChromeDriver();
			
		}
		else if(browsrName.startsWith("f"))
		{
			System.setProperty("webdriver.gecko.driver","path if geckoDriver exe");
			WebDriver driver = new FirefoxDriver();
			
			
		}
		else if(browsrName.startsWith("i"))
		{
			
			System.setProperty("webdriver.ie.driver","path if InterNetExplorerDriver exe");
			WebDriver driver = new InternetExplorerDriver();
			
		}
		else if(browsrName.startsWith("s"))
		{
			
		}
		else if(browsrName.startsWith("a"))
		{
			
		}
		else
		{
			System.out.println("Browser said correctely ");
		}
		
		
	}
	public static void openURL()
	{
		driver.get(Utils.getProperty("URL", "env"));
	}
	public WebElement getElement()
	{
		
		
		return null;
		
	}
	
	public static String getProperty(String key,String fileName)
	{

		try {
			FileInputStream fin = new FileInputStream("../AutomationFramework/EnvironmentDependencies/"+fileName+".properties");
			Properties prop = new Properties();
			prop.load(fin);
			fin.close();
			return prop.getProperty(key);
		
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

	
	

}
