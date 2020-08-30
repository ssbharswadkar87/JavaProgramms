package SeleniumEasy;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calendar extends SeleniumEasy_CommonClass {

	public Calendar() throws Exception {
		super();
	}

	SeleniumEasy_CommonClass base;

	@BeforeMethod
	public void setUP2() throws Exception {

		setUP();
		log.info("==========Browser launched==========");
		String PageTitle1 = driver.getTitle();
		System.out.println("Title of the page is ==>" + PageTitle1);
		log.info("==========Received title of Home Page==========");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();
		// To close notification
		driver.findElement(By.xpath("//a[contains (text(), 'Date pickers')][@class='dropdown-toggle']")).click();
		// click on Date pickers link to navigate on Date pickers page

		base = new SeleniumEasy_CommonClass();
	}

	@Test()
	public void bootStrapDatePicker() throws Exception {

		//select location of properties file
		File src = new File("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\Object-Repository.properties");
		//Create FileInputStream object to load file
		FileInputStream fis = new FileInputStream(src);
		// create properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis);
		driver.findElement(By.linkText(pro.getProperty("calendar1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("selectCalendar"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("selectMonth"))).click();
		driver.findElement(By.xpath(pro.getProperty("selectDate"))).click();
	}

	@AfterMethod
	public void tearDown1(ITestResult result) throws Exception {
		Thread.sleep(3000);
		captureScreenShot(result);
		log.info("closing the browser");
		// tearDown();
	}

}
