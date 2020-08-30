package pqrs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Drivers\\ChromeDriver_Win32 file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch of Firefox
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete cookies
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				// switching to child window
				driver.switchTo().window(ChildWindow);
				// closing child window
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
		//WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//	
//		String alertText = alert.getText();
//		System.out.println("Text on the alert box is ==>" +alertText);
//		alert.dismiss();
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("shantnu.bharswadkar@gmail.com");
	
		Thread.sleep(3000);
	driver.quit();
	}

}
