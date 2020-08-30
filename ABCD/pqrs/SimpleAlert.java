package pqrs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Drivers\\ChromeDriver_Win32 file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch of Firefox

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete cookies

		driver.get("file:///C:/Users/Dell/Desktop/DemoWebPopup.htm"); // Launch of google URL

		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Thread.sleep(3000);

//	String alertText = driver.switchTo().alert().getText();    //OR you can write in below way
//	System.out.println("Alert window message is==>" +alertText);

		Alert alert = driver.switchTo().alert();
		String alertText1 = alert.getText();
		System.out.println("Alert window message is==>" + alertText1);

//	alert.accept();
		alert.dismiss();

		Thread.sleep(3000);
		driver.quit();

	}

}
