package org.testcases;

import org.pages.InitPages;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.utility.Utils;

public class LoginTestCaseWebApp extends InitPages {
	@Test
	public void loginWebApp() 
	{
		Utils.openBrowser();
		Reporter.log("Opened the Browser");
		Utils.openURL();
		Reporter.log("Opened the URL");
		loginpage.signInButton().click();
		Reporter.log("Enter \"Abcd\" in UserName TextBox On loginpage");
	}
	@Test
	public void loginAndroid() 
	{
		Utils.openBrowser();
		Utils.openURL();
		//Enter "Abcd" in UserName TextBox On loginpage
		
		loginpageandroid.signInButton().clear();
	}
}
