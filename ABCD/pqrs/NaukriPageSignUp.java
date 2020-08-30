package pqrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NaukriPageSignUp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver_Win32 file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(1000);
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\pqrs\\config.properties");
		prop.load(ip);
		
		driver.get(prop.getProperty("Website"));
				
		Set<String> Handler = driver.getWindowHandles();
		Iterator<String> IT = Handler.iterator();
		String parentWindowID = IT.next();
		System.out.println("Parent Window ID is : "+parentWindowID);
		String childWindowID = IT.next();
		driver.switchTo().window(childWindowID);
		driver.close();
		driver.switchTo().window(parentWindowID);
		//Thread.sleep(1000);
		
		Set<String> Handler1 = driver.getWindowHandles();
		Iterator<String> IT1 = Handler1.iterator();
		String parentWindowID1 = IT1.next();
		System.out.println("Parent Window ID is : "+parentWindowID1);
		String childWindowID1 = IT1.next();
		driver.switchTo().window(childWindowID1);
		driver.close();
		driver.switchTo().window(parentWindowID1);
		//Thread.sleep(1000);
		
		
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.dismiss();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"orangeBtn bifurLightBox\"]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class=\"action-btn exp\"]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-valid-maxlength']")).sendKeys(prop.getProperty("Name"));
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//input[@name=\"number\"]")).sendKeys(prop.getProperty("MobileNumber"));
		
		driver.findElement(By.name("expYear")).sendKeys("4", Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(By.name("expMonth")).sendKeys("4", Keys.ARROW_DOWN, Keys.ENTER);
		//driver.findElement(By.name("uploadCV")).sendKeys("E:\\Documents\\SeleniumDemoDocument.docx");
		//driver.findElement(By.xpath("//input[@name=\"term\"]")).click();
		//driver.findElement(By.xpath("//label[@class=\"customChkBoxLbl chkboxLbl\"]")).click();
		Thread.sleep(5000);
		WebElement checkBox = driver.findElement(By.name("term"));
		checkBox.click();
	
		
		
		
	}

	private static void WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		
	}

}
