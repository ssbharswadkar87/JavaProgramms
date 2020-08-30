package pqrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverORMousemovement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch of Firefox
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/default.aspx");
		
		Actions action = new Actions(driver);
		
	//	action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform(); //mouseover on Addons tab
		
		// action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		// above line is not working so devided mouseover in two lines and it worked
		
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Member Login")).click();
	//	driver.findElement(By.linkText("SpiceMax")).click(); // click onSpiceMax option 

	}

}
