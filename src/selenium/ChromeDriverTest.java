package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("gacfhjdfghjfgjsfjfdsdhjkhfg");
		driver.findElement(By.id("pass")).sendKeys("dfcghfhfgdcadhfg");
		driver.findElement(By.name("login")).click();
	}

}
