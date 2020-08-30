package pqrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();  // creating object of Properties class
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\pqrs\\config.properties"); //object of FileInputStream class
		
		prop.load(ip);  // we have to load the file 
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Surname"));
		
		// Or we can also use as
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browser = prop.getProperty("Browser");
		System.out.println(browser);
		
	}

}
