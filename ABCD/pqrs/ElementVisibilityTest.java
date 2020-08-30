package pqrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementVisibilityTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Dynamic Wait
		
		driver.get("https://phptravels.org/register.php");
		
		// isDisplayed method: applicable for all the web elements
		
		boolean b1 = driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(b1);
		
		// isEnabled method: primarily used with buttons
		
		boolean b2 = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		System.out.println(b2);
		
		//isSelected method:
		
		boolean b3 = driver.findElement(By.xpath("//div[@class='selected-dial-code']")).isSelected();
		System.out.println(b3); // it will send as false as no value selected for drop-down
		
		/* Select select = new Select(driver.findElement(By.xpath("//div[@class='selected-flag']")));
		select.selectByVisibleText("+44");
		*/
		
		
		driver.findElement(By.xpath("//div[@class='selected-flag']")).sendKeys("United Kingdom");
		Select select = new Select(driver.findElement(By.xpath("//div[@class='selected-flag']")));
		select.selectByValue("+44");
	}

}
