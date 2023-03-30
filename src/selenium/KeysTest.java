package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://twitter.com/i/flow/login");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bhfvhjxcbv");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		
	}

}
