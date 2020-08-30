package pqrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver_Win32 file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
//		//to get attribute value of any webelement
//		WebElement abc = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
//		String pqr = abc.getAttribute("class");
//		System.out.println(pqr);
		
		
		driver.get("https://jqueryui.com/draggable/");
		
		
		
		
		
		
	}
		
	}


