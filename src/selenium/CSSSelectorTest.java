package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		// tagName[attributeName='AttributeValue']
		//*[attributeName='AttributeValue']
		//input[data-testid='royal_email'][id='email']
		
	/*	input[data-testid*='yal_emai']  - * contains
		input[data-testid^='royal_emai']  - ^ Starts-with
		input[data-testid$='yal_email']  - $ Ends-with*/
		
//		div[class='_6lux']>input
		
//		#email  - CSS with id (# is for id)
//._6lux  - CSS with Class (. is for Class)

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("#email")).sendKeys("ghxjkvghxcv");
		driver.findElement(By.cssSelector("input[type='password'][id='pass']")).sendKeys("sdhfjksdhfjhsd");;
		
		driver.findElement(By.cssSelector("button[type^='submi']")).click();
		
	}

}
