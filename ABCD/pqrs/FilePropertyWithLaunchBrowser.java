package pqrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FilePropertyWithLaunchBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\pqrs\\config.properties");
		prop.load(ip);
		 
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Surname"));
						// Or we can also use as
		String urlName = prop.getProperty("URL");
		System.out.println(urlName);
			
		String browserName = prop.getProperty("Browser");
		System.out.println(browserName);
		
		if (browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver(); //Launch of Firefox
		    
		}else if (browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    driver = new FirefoxDriver(); //Launch of Firefox
		}
		
		driver.get(urlName);

	}

}
