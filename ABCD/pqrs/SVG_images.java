package pqrs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_images {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://debeissat.nicolas.free.fr/svg3d.php");
		
		driver.switchTo().frame("svg_result");
		while(true) {
		List<WebElement> eleList	= (List<WebElement>) driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']//*[local-name()='path' and contains(@id,'face')]"));
		
		for(WebElement ele: eleList) {
			String text = null;
			text = ele.getAttribute("d");
			System.out.println(text);
			}
		}
	}

}
