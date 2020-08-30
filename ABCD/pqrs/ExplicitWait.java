package pqrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch of Firefox
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete cookies
		
		driver.get("https://www.facebook.com/");  //Launch of Facebook  URL
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); //implicit wait timeout
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  //implicit wait timeout
		
		clickOn(driver, driver.findElement(By.id("u_0_b")), 10);		

	driver.close();
	
	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
				locator.click();
	}

}
