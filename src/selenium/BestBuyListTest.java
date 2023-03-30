package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuyListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//li[@data-automation='shop']")).click();
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("(//div[@data-automation='menu-main-l1'])[1]/a"), 27));
		
		
		List<WebElement> allList =driver.findElements(By.xpath("(//div[@data-automation='menu-main-l1'])[1]/a"));
		System.out.println(allList.size());
		
		Thread.sleep(2000);
		
		for(WebElement w : allList) {
			System.out.println(w.getText());
		}
		
		driver.quit();
		
		

	}

}
