package pqrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.id("firstName")).sendKeys("Swara");
		driver.findElement(By.id("lastName")).sendKeys("Bharswadkar");
		driver.findElement(By.id("username")).sendKeys("swara.bharswadkar");
		driver.findElement(By.name("Passwd")).sendKeys("Abc@12345");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Abc@12345");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	}

}
