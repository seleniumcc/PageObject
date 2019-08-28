package org.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HowToReadDataFromPropertiesFile {

	public static void main(String[] args) {
		

		try {
			FileInputStream fin = new FileInputStream("../AutomationFramework/EnvironmentDependencies/env.properties");
			Properties prop = new Properties();
		
			prop.load(fin);
		
			System.out.println(prop.getProperty("browserName"));
		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
