package SeleniumEasy;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ArrowFunction;

public class InputForms extends SeleniumEasy_CommonClass {

	
	
	public InputForms() throws Exception {
		super();
		WebDriverWait wait = new WebDriverWait(driver, 50);
	}

	SeleniumEasy_CommonClass base;


	@BeforeMethod
	public void setUP1() throws Exception {

		setUP();
		log.info("==========Browser launched==========");
		String PageTitle1 = driver.getTitle();
		System.out.println("Title of the page is ==>" + PageTitle1);
		log.info("==========Received title of Home Page==========");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();
		//To close notification
		log.info("==========Navigating to Simple Form Demo page==========");
		driver.findElement(By.xpath("//a[contains (text(), 'Input Forms')][@class='dropdown-toggle']")).click();
		//click on Input Forms link to navigate on Input Forms page
		
		base = new SeleniumEasy_CommonClass();
	}

	@Test(priority = 1, enabled = true)
	public static void simpleFormDemo() throws InterruptedException {
		log.info("==========1. Simple Form Demo Test started==========");
		driver.findElement(By.linkText("Simple Form Demo")).click();
		log.info("==========User is on Simple Form Demo page==========");
		String ExpectedTitle1 = "Selenium Easy Demo - Simple Form to Automate using Selenium";
		String ActualTitle1 = driver.getTitle();
		Assert.assertEquals(ActualTitle1, ExpectedTitle1, "Actual Page Title is not matching with Expected Page Title");
		System.out.println("Title of the SimpleFormDemo is correct.");
		log.info("==========Page Title of Simple Form Demo page validated and it is correct==========");

		// check single input

		log.info("==========Validating Single Input test==========");
		String SingleInput = "Cheking Single Input field.";
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(SingleInput);
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		String SingleOutput = driver.findElement(By.xpath("//span[@id='display']")).getText();
		Assert.assertEquals(SingleInput, SingleOutput, "Input data is different than output data");
		System.out.println("Susseccfully completed single input form");
		log.info("==========Single Input Test successfully validated==========");

		log.info(
				"================================================================================================================");
		// System.out.println("========================================================================================================");
		Thread.sleep(4000);

		// check two input fields
		int a = 10;
		int b = 20;
		int c = a + b;

		String C = String.valueOf(c);
		log.info("==========Validation of Two input fileds==========");
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("" + a);
		log.info("==========Values of first field is given==========");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("" + b);
		log.info("==========Values of second field is given==========");

		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
		String DoubleinputOutput = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

		Assert.assertEquals(DoubleinputOutput, C, "Addition is wrong");
		if (C.equals(DoubleinputOutput)) {
			System.out.println("Addition of two input fields is correct");
		} else {
			System.out.println("Addition is wrong");
		}
		log.info("==========Validation of 2 input field is successfully completed==========");

		log.info("==========Simple Form Demo Test case is completed==========");
		log.info(
				"****************************************************************************************************************************");

	}

	@Test(priority = 2, enabled = true)
	public static void checkBoxDemo() {

		log.info("==========2. Check Box Demo test case is started==========");
		log.info("==========Navigating to Check Box Demo page==========");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Checkbox Demo')]")).click();
		String PageTitle2 = driver.getTitle();
		Assert.assertEquals(PageTitle2, "Selenium Easy - Checkbox demo for automation using selenium",
				"Actual Page Title is not matching with Expected Page Title");
		log.info("==========Page Title validation is successful ==========");

		// single checkbox

		WebElement singleCheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		Assert.assertFalse(singleCheckBox.isSelected(), "Checkbox is already selected");
		log.info("Click on single checkbox ");
		singleCheckBox.click();
		Assert.assertTrue(singleCheckBox.isSelected(), "Single checkbox is selected");
		log.info("single checkbox selection scenario successfully completed");

		// multiple checkbox

		WebElement CheckAll = driver.findElement(By.xpath("//input[@id='check1']"));
		WebElement Option1 = driver.findElement(By.xpath("//label[text()='Option 2']//input[@class='cb1-element']"));

		Assert.assertFalse(Option1.isSelected(), "Option1 is already selected");
		CheckAll.click();
		Assert.assertTrue(Option1.isSelected(), "Option1 is not selected");
		log.info("All options are selected");

		CheckAll.click();
		Assert.assertFalse(Option1.isSelected(), "Option1 is selected");
		log.info("All options are successfully unchecked ");

		log.info("multiple checkbox selection scenario successfully completed");

		log.info("==========Checkbox Demo Test case is completed==========");
		log.info(
				"****************************************************************************************************************************");
	}

	@Test(priority = 3, enabled = true)
	public void radioButtonDemo() {

		log.info("==========3. Radio Button Demo test case is started==========");
		log.info("==========Navigating to Radio Button Demo page==========");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Radio Buttons Demo')]")).click();
		String PageTitle3 = driver.getTitle();
		Assert.assertEquals(PageTitle3, "Selenium Easy Demo - Radio buttons demo for Automation",
				"Actual Page Title is not matching with Expected Page Title");
		log.info("==========Page Title validation is successful ==========");

		// single Radio Button

		driver.findElement(By.xpath("//input[@value='Male'][@name='optradio']")).click();
		driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		WebElement SingleRadioBtn = driver.findElement(By.xpath("//p[@class='radiobutton']"));
		Assert.assertEquals(SingleRadioBtn.getText(), "Radio button 'Male' is checked",
				"Actual output is different than Expected output");
		log.info("single radio button selection scenario successfully completed");

		log.info("==========Checkbox Demo Test case is completed==========");
		log.info(
				"****************************************************************************************************************************");
	}

	@Test(priority = 4, enabled = true)
	public void dropDownDemo() {

		log.info("==========4. Dropdown Demo test case is started==========");
		log.info("==========Navigating to Dropdown Demo page==========");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]"))
				.click();
		String PageTitle4 = driver.getTitle();
		Assert.assertEquals(PageTitle4, "Selenium Easy Demo - Automate All Scenarios",
				"Actual Page Title is not matching with Expected Page Title");
		log.info("==========Page Title validation is successful ==========");

		// single value from dropdown
		log.info("Selecting single value from drpdown list");
		Select drpdown = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		boolean drpdown1 = drpdown.isMultiple();
		Assert.assertFalse(drpdown1, "Dropdown allows only single value");
		log.info("Dropdown allows to select only single value");
		drpdown.selectByValue("Sunday");
		String drpdown2 = driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
		System.out.println(drpdown2);
		log.info("Value selection from dropdown scenario successfully completed");

		log.info("==========DropDown Demo Test case is completed==========");
		log.info(
				"****************************************************************************************************************************");
	}

	@Test(priority = 5, enabled = true)
	public static void InputForm() {

		log.info("==========5. Input Form Demo test case is started==========");
		log.info("==========Navigating to Input Form Demo page==========");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")).click();
		String title4 = driver.getTitle();
		Assert.assertEquals(title4, "Selenium Easy - Input Form Demo with Validations",
				"Page title is different than expected title");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@placeholder='(845)555-1212']")).sendKeys(prop.getProperty("phone"));
		driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys(prop.getProperty("address"));
		driver.findElement(By.xpath("//input[@placeholder='city']")).sendKeys(prop.getProperty("city"));
		
		Select drpDown1 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		drpDown1.deselectByVisibleText("Alaska");
		
		driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys(prop.getProperty("zipcode"));
		driver.findElement(By.xpath("//input[@placeholder='Website or domain name']")).sendKeys(prop.getProperty("website"));
		driver.findElement(By.xpath("//input[@name='hosting'][@value='no']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")).sendKeys(prop.getProperty("description"));
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		log.info("==========Input Form Demo test case is started==========");
		log.info(
				"****************************************************************************************************************************");
	}

	@Test(priority = 6, enabled = true)
	public static void AjaxForm() throws Exception {
		
		log.info("==========6. Ajax Form Demo test case is started==========");
		log.info("==========Navigating to Ajax Form Demo page==========");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Ajax Form Submit')]")).click();
		
		String title6 = driver.getTitle();
		Assert.assertEquals(title6, "Selenium Easy - Ajax Form submit demo for automation",
				"Page title is different than expected title");
		log.info("Page title validation is succeessful");
		
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("PQR");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("akfjjahhfkajdhfdldksldkjlsdkjf");
		driver.findElement(By.xpath("//input[@id='btn-submit']")).click();
		
		Thread.sleep(3000);
		String SubmitionText = driver.findElement(By.xpath("//div[@id='submit-control']")).getText();
		Assert.assertEquals(SubmitionText, "Form submited Successfully!", "Actual text appearing is different than Expected text");
		log.info("Ajax Form successfully submitted");
		
		log.info("==========Ajax Form Demo test case is started==========");
		log.info(
				"****************************************************************************************************************************");
	}	

	@Test(priority = 7, enabled = true)
	public static void JQuerySelectDrpDown() throws Exception {

		log.info("==========7. JQuery Select DropDown Form Demo test case is started==========");
		log.info("==========Navigating to JQuery Select DropDown Form Demo page==========");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Select dropdown')]"))
				.click();

		String title7 = driver.getTitle();
		Assert.assertEquals(title7, "Selenium Easy - JQuery Select and Multi Select Demo",
				"Page title is different than expected title");
		log.info("Page title validation is succeessful");

		

		WebDriverWait wait = new WebDriverWait(driver, 50);
//		WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='select2-selection__arrow']")));
//		WebElement country1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='select2-search select2-search--dropdown']/input")));
//		country1.sendKeys("India");
//		Thread.sleep(5000);
		
		//Select country from drop down
		log.info("Select country from drop down");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='select2-selection__arrow']")).click();
		driver.findElement(By.xpath("//*[@class='select2-search select2-search--dropdown']/input")).sendKeys(prop.getProperty("country"), Keys.ENTER);
		log.info("Given country selected successfully");

		//Select multiple states from dropdown
		log.info("Select multiple states from dropdown");
		driver.findElement(By.xpath("//li[@class='select2-search select2-search--inline']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select state(s)']")).sendKeys(prop.getProperty("state1"), Keys.ENTER);
		//driver.findElement(By.xpath("//li[@class='select2-search select2-search--inline']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(prop.getProperty("state2"), Keys.ENTER);
		Boolean SelectState = driver.findElement(By.xpath("//li[@title='Arizona']")).isDisplayed();
		Assert.assertTrue(SelectState, "Selected state is not displayed");
		log.info("state value selected successfully");
		
		
		//select territory from dropdown
		log.info("Select territory from dropdown");
		driver.findElement(By.xpath("//span[@class='select2-selection__rendered'][@title='American Samoa']")).click();
		//log.info("done1");		//just to know whether above step got execute or not
		
		//WebElement territory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")));
		//either use above wait concept or use below 2 steps which include Thread.sleep(5000) and WebElement territory
		Thread.sleep(5000);
		WebElement territory = driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"));
		territory.sendKeys(prop.getProperty("territory"), Keys.ENTER);
		//log.info("done2");		//just to know whether above step got execute or not
		
		
		String SelectedTerritory = driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--single' and @role='combobox']/following::span[@class='select2-selection__rendered']")).getText();
		Assert.assertEquals(SelectedTerritory, prop.getProperty("territory"), "Selected territory is disabled status or not available");
		if(true) {		
		System.out.println("Selected Territory is ==>" + SelectedTerritory);
		log.info("Territory successfully selected");
		}
		
		log.info("==========JQuery Select DropDown Form Test case is completed==========");
		log.info(
				"****************************************************************************************************************************");
		
	}

	@AfterMethod
	public void tearDown1(ITestResult result) throws Exception {
		Thread.sleep(3000);
		captureScreenShot(result);
		log.info("closing the browser");
		tearDown();
	}

}
