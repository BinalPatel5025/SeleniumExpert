package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsertestProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f= new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		WebDriver driver;
		
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
		
		
		driver.findElement(By.id("email")).sendKeys("gacfhjdfghjfgjs");
		driver.findElement(By.id("pass")).sendKeys("dfcghfhfgdcadhfg");
		driver.findElement(By.name("login")).click();
	}

}
