package pqrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RefreshWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch of Firefox
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete cookies
		
		driver.get("https://www.google.com");  //Launch of google URL
		
		Thread.sleep(2000);
		
		driver.navigate().refresh(); // to refresh page
		
		
	}

}
