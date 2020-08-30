package SeleniumEasy;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class SeleniumEasy_CommonClass {

	static WebDriver driver;
	static int a = 10;
	public static Properties prop;

	static Logger log = Logger.getLogger(SeleniumEasy_CommonClass.class);
	
	

	public SeleniumEasy_CommonClass() throws Exception {

		prop = new Properties();
		// File src = new File(pathname); //location of config.properties file
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Dell\\eclipse-workspace\\ABCD\\SeleniumEasy\\properties\\config.properties");
		prop.load(ip);

//		//create FileInputStream object to load file
//		FileInputStream fis = new FileInputStream(src);
//		
//		//location of config.properties file
//				//File src = new File(pathname);
//					File src = new File("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\SeleniumEasy\\properties\\config.properties");
//				
//					//create FileInputStream object to load file
//				FileInputStream fis = new FileInputStream(src);
//				
//				//create properties class object to read properties
//				Properties pro = new Properties();
//				pro.load(fis);

		
		
	}

	public static void setUP() {

//		Logger log = Logger.getLogger("SeleniumEasy_CommonClass");
//		PropertyConfigurator.configure("C:\\Users\\Dell\\eclipse-workspace\\ABCD\\log4j.properties");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Drivers\\ChromeDriver_Win32 file\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.seleniumeasy.com/test/");

	}

	public static void captureScreenShot(ITestResult result) throws Exception {
		// ItestResult is interface which will provide test-case execution status and test-case name
		// result is a argument
		// we are taking screenshot for only failed cases

		if (ITestResult.FAILURE == result.getStatus()) {

			// creating reference of TakesScreenshot Interface and type casting (means
			// assigning a value of one type of data into another type)

			TakesScreenshot ts = (TakesScreenshot) driver; // type casting of 2 interfaces TakesScreenshot and driver

			// call method to capture screeshot in terms of FILE
			// getScreenshotAs method return type is FILE

			File source = ts.getScreenshotAs(OutputType.FILE);

			// copy file to specific location
			// Dot slash (./) means want to store screenshot at project lavel and create
			// Screenshots folder
			FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
		}

	}

	public static void currentDateAndTime() {
		
		// Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
		
	}
	
	public static void tearDown() {
		driver.quit();
	}

}
