package pqrs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Dynamic Wait
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));             
		//  //li means give me all li available under ul. so ul is parent and li is child

		
		
		System.out.println("Total Number of suggestions are --> " +list.size());
		
		for(int i=0; i<list.size(); i++) {
		
			System.out.println(list.get(i).getText());	
			
			if(list.get(i).getText().contains("testing pyramid")) {
				list.get(i).click();
				break;
			}
		} 
		
		driver.findElement(By.xpath("//h3[contains(text(),'The Testing Pyramid - Agile in a Nutshell')]")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
	}

}
