package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) {
		
		String browser="Chrome"; //Chrome, Safari // We'll read this value from Data file - Excel, Properties.
		WebDriver driver; // at this poiny driver is empty
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.safari.driver", "C:\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}
	
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("gacfhjdfghjfgjsfjfdsdhjkhfg");
		driver.findElement(By.id("pass")).sendKeys("dfcghfhfgdcadhfg");
		driver.findElement(By.name("login")).click();
		
	}

	
}
