package SeleniumEasy;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickers extends SeleniumEasy_CommonClass{

	public DatePickers() throws Exception {
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
		//To close notification
		driver.findElement(By.xpath("//a[contains (text(), 'Date pickers')][@class='dropdown-toggle']")).click();
		//click on Date pickers link to navigate on Date pickers page
		
		base = new SeleniumEasy_CommonClass();
	}

	@Test()
	public void bootStrapDatePicker() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		log.info("==========Navigating to Bootstrap Date Picker page==========");
		log.info("==========1. Bootstrap Date Picker Test started==========");
		driver.findElement(By.linkText("Bootstrap Date Picker")).click();
		log.info("==========User is on Bootstrap Date Picker page==========");
		String ExpectedTitle1 = "Selenium Easy - Best Demo website for Bootstrap Date picker";
		String ActualTitle1 = driver.getTitle();
		Assert.assertEquals(ActualTitle1, ExpectedTitle1, "Actual Page Title is not matching with Expected Page Title");
		System.out.println("Title of the Bootstrap Date Picker page is correct.");
		log.info("==========Page Title of Bootstrap Date Picker page validated and it is correct==========");

		// Date example
		System.out.println("Current date and time is ==> "); 
		currentDateAndTime();
		
		Thread.sleep(3000);
		//click on calender
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='glyphicon glyphicon-th']"))).click();
		//driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")).click();
		Thread.sleep(3000);
		
		//to check number of columns
	
		List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@class='table-condensed']/thead/tr[3]/th"));
		System.out.println("Number of Columns in table are==>" + numberOfColumns.size());
		
		//to check number of rows
		List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@class='table-condensed']/tbody"));
		System.out.println("Number of Rows in table are ==>" + numberOfRows.size());	
		
		
		
//		Thread.sleep(5000); 
//		
//		Boolean futureDate = driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr[2]/td[10]")).isEnabled();
//		System.out.println(futureDate);
		//WebElement futureDate = driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr[2]/td[4]"));
		//Assert.assertFalse(futureDate.isEnabled(), "Future date is enabled so it is not valid scenario");
//		if(true) {
//		System.out.println("Selected date is future date so it is in disabled format");
//		}
		
			
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown1(ITestResult result) throws Exception {
		Thread.sleep(3000);
		captureScreenShot(result);
		log.info("closing the browser");
		//tearDown();
	}
	
}
