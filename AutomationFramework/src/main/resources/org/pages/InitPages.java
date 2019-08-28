package org.pages;

import org.testng.annotations.BeforeTest;

public class InitPages {
	
	public Loginpage loginpage = null;
	public LoginpageAndroid loginpageandroid=null;
	@BeforeTest
	public void initilizedpages() 
	{
		 loginpage = new Loginpage();
		 loginpageandroid = new LoginpageAndroid();
		
	}

}
