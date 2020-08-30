package pqrs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class WebPageScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch of Firefox
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete cookies
		
		driver.get("https://www.google.com");  //Launch of google URL
		
		Thread.sleep(2000);
		
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the screenshot to desired location using copy method
		Files.copy(src, new File("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\pqrs\\screemshot.png"));

		
	}

}
