package selenium;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// Type canada 10
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("canada");
		
		Thread.sleep(2000);
		
		List<WebElement> yahooSuggestion = driver.findElements(By.xpath("//ul[@class='_yb_h96gw']/li")); // you can use role as xpath
		System.out.println(yahooSuggestion.size());
		
		for(WebElement a : yahooSuggestion) {
			System.out.println(a.getText());
		}
		//.quit();
		
		
		}

}
