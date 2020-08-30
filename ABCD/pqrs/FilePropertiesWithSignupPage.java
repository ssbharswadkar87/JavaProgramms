	package pqrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FilePropertiesWithSignupPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\pqrs\\config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Surname"));
		
		String emailID = prop.getProperty("Email");
		System.out.println(emailID);
		
		String password = prop.getProperty("Password");
		System.out.println(password);
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Drivers\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// driver.get("https://reg.ebay.co.uk/reg/PartialReg");
		driver.get(prop.getProperty("Website"));
		Thread.sleep(3000);
		
		driver.findElement(By.id("firstname")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.id("lastname")).sendKeys(prop.getProperty("Surname"));
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.id("PASSWORD")).sendKeys(prop.getProperty("Password"));
		//driver.findElement(By.id("email")).sendKeys(prop.getProperty(emailID));
		//driver.findElement(By.id("PASSWORD")).sendKeys(prop.getProperty(password));
		
		driver.findElement(By.id("ppaFormSbtBtn")).click();
		
		
		
	}

}
