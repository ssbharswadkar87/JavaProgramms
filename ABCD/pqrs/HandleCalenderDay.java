package pqrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalenderDay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Dynamic Wait
		
		driver.get("https://ui.freecrm.com/"); //Launch URL
		
		driver.findElement(By.name("email")).sendKeys("ssbharswadkar87@gmail.com");    //Login ID
		driver.findElement(By.name("password")).sendKeys("Abc@12345");					// Login Password
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();		//Click on Submit button
		
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		
		String date = "21-June-2020";  // date which we want to select
		String dateArr[] = date.split("-"); //it will seperate date in 3 parts
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]/i")).click();
		
		
		/*   //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div[1]
		    //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div[1]
		   //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[7]/div[1]/div[1]
		  //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[7]/div[2]/div/div[7]
		 //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[7]/div[2]/div/div[6]
		  
		xpath of first week (second row of calendar), 2nd week (3rd row of calendar) like this till 7th week */ 
		
		String beforeXpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[7]/div[";
		String afterXpath = "";
		
		
		
	}

}
