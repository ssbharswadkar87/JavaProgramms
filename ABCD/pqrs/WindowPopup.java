package pqrs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch of Firefox
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		
		// WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("XXX")));
		
		driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #1')]")).click();
		
		// Return a set of window handles
		Set<String> ABC = driver.getWindowHandles();
		System.out.println("Number of windows available are ==> " + ABC );
		
		Iterator<String> PQR	= ABC.iterator();
		
		//to get parent window id
		String parentWindowID = PQR.next();
		System.out.println("Parent Window ID is:  " + parentWindowID);
		
		//to get first child window id
		String childWindowID = PQR.next();
		System.out.println("Child Window ID is: " + childWindowID);
		
		// to switch popup window
		driver.switchTo().window(childWindowID);
		
		
		//System.out.println("Title of Child Window is: " +driver.getCurrentUrl());
		System.out.println("Title of PopUP window (Child window) is :" +driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Title of Parent Window is : "+driver.getTitle());
		
		
		WebElement month_dropdown = driver.findElement(By.id("xxx"));
		month_dropdown.sendKeys("XXX"); //provide month name in place of XXX
		
		
		
	}

}
