package org.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenSafari {

	public static void main(String[] args) {
		

		WebDriver driver = new SafariDriver();
		driver.get("http://vindeep.com");
		driver.manage().window().maximize();
		
		//System.out.println(driver.switchTo().activeElement().
			

	}

}
