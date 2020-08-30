package pqrs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch of Firefox
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete cookies
		
		driver.get("https://www.spicejet.com/default.aspx");  //Launch of URL
		
		
		// Dynamic wait time which will wait to load full page. if page loads in 5 seconds it will not wait for next 35 seconds.
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//1. get total counts of Links on the page
		//2. get text of each link on the page
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//1. size of Links
		System.out.println("Total number of links on the page are =" );
		System.out.println(linkList.size());
		
		//2. Test of Each link
		
		 System.out.println("Text on the Link are");
		for(int i=0; i<linkList.size(); i++) {
		 String linkText =  linkList.get(i).getText();
						 System.out.println(linkText);
		 
		}
	}

}
