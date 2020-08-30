package pqrs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();		//click on Contact
		
		driver.navigate().refresh();  //page refresh
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Dynamic Wait
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Dynamic Wait
		
		/* Method 1
		
		 below are absolute xpath for two fields which are avaiable in Table. If we observe everything is same except tr1 and tr2.
		  tr1 and tr2 are different rows. i.e. row number 1 and 2 and from that row we have taken absolute xpath for Name column  
		/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]
		/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]

		Now we will break xpath in two parts
		
		
		String before_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i=4; i<=4; i--) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();  
			System.out.println(name);
			
			if(name.contains("DEF JKL")) {
				// /html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/label
				
				driver.findElement(By.xpath("//td[contains(text(),'DEF JKL')]")).click();
				//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[" + i + "]/td[1]/div/label")).click();
			} 
		} */
		
		
		/* Method 2
		driver.findElement(By.xpath("//td[contains(text(),'XYZ ABC')]/parent::td//preceding-sibling::td//input[@name='id']")).click();
		
		*As of now method 2 is not working but if we only keep beow then it is working
		* driver.findElement(By.xpath("//td[contains(text(),'XYZ ABC')]")).click();
		*/
		
		
	//driver.findElement(By.xpath("//div[@class='ui fitted read-only checkbox']/input")).click();
	driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/div/input")).click();
	
	//	driver.findElement(By.xpath("//td[contains(text(),'XYZ ABC')]/parent::tr//preceding-sibling::td//input[@name='id']")).click();
	
	
	
	
	
	}

}
