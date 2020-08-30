package pqrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateWebPage {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch of Firefox
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete cookies
		
		driver.get("https://www.google.com");  //Launch of google URL
		
		
		// Dynamic wait time which will wait to load full page. if page loads in 5 seconds it will not wait for next 35 seconds.
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				
		driver.navigate().to("https://www.facebook.com"); // navigate to another web page Facebook
		
		Thread.sleep(2000);
		
		driver.navigate().back(); // again navigate back to google URL
		
		Thread.sleep(2000);
		
		driver.navigate().forward(); // again navigate to Facebook URL
		

	}

}
