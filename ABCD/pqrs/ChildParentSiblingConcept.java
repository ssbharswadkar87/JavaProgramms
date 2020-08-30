package pqrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildParentSiblingConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Dynamic Wait
		
		driver.get("https://www.actitime.com/");
		
		driver.getPageSource();
		//driver.findElement(By.xpath("//div[@class='header__container']/child::nav/child::ul/child::li[2]")).click();
		

	}

}
