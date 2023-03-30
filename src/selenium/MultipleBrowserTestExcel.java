package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import selenium.Xls_Reader;

public class MultipleBrowserTestExcel {

	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader("C:\\testing\\multibrowser2.xlsx");
		
		String browser=d.getCellData("Sheet1", 0, 2); 
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
		
		
		driver.findElement(By.id("email")).sendKeys("gacfhjdfghjfgjsfjfdsdhjkhfg");
		driver.findElement(By.id("pass")).sendKeys("dfcghfhfgdcadhfg");
		driver.findElement(By.name("login")).click();

	}

	
}