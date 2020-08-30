package pqrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {
	
	//	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	
	driver.getTitle();
	    String title =  driver.getTitle();
	System.out.println(title);
	


	if (title.equals("Google")) 
	{
		System.out.println("Title is correct");
	}else
		System.out.println("Title is wrong");
	
	System.out.println(driver.getCurrentUrl());
	
	
	
	}

}
