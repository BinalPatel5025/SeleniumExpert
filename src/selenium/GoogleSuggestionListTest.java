package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"), 10));
		
		List<WebElement> googleSerchList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(googleSerchList.size());
		 
		 for(WebElement a :googleSerchList) {
			 System.out.println(a.getText());
		 }
		 
		 driver.quit();
	}


	
	//FluentWait
	//	https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html


}
