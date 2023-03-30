package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("gacfhjdfghjfgjsfjfdsdhjkhfg");
		driver.findElement(By.id("pass")).sendKeys("dfcghfhfgdcadhfg");
		driver.findElement(By.name("login")).click();
		
		
	}
}
