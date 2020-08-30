package pqrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateContacts {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete cookies
	
		/*	driver.get("https://ui.freecrm.com/");
		
	 //	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); //implicit wait timeout
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  //implicit wait timeout
		
		
		driver.findElement(By.xpath("//input[@name='email' and @placeholder='E-mail address']")).sendKeys("ss_bharswadkar@yahoo.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc@12345");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
		
	//driver.switchTo().frame(1);
		Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]/span"))).build().perform();
		//driver.findElement(By.xpath("//span[contains(text(),'Contacts') and @class='item-text']")).click();
		//driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(1) div.ui.fluid.container div.ui.left.fixed.vertical.icon.menu.sidebar-dark.expanded.left-to-right:nth-child(1) > a.item:nth-child(3)")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]/span")).click();
		*/
		
		driver.get("https://ui.freecrm.com/contacts");
		
		

	}

}
