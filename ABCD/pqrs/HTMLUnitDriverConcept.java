package pqrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();  //use this webdriver
		
		// to use this we have to download htmlunitdriver jar file and import in BuildPath
		//with use of this concept, testing will perform behind scene and no browser is launched
		//with this performance of script will be fast and testing will be fast
		//it is also called as Ghost driver or Headless driver9/:;ljm 
		//WebDriver driver = new ChromeDriver();  // do not use this webdriver if you are using html driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}

}
