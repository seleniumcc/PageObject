package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.Utils;

public class LoginpageAndroid extends Utils{
	
	By uname = By.id("userName");
	By pass= By.name("Pass");
	
By SingIn = By.xpath("/html/body/section/div/div[2]/div[2]/div/div");
	
	
	public WebElement signInButton() {
		return driver.findElement(SingIn);
	}
	
	
	public WebElement userNameTextBox(){
		
		return driver.findElement(uname);
		
	}
	public WebElement passwordTextBox(){
		
		return driver.findElement(pass);
		
	}

}
