package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// 7 hover on hello
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		WebElement hover = driver.findElement(By.id("nav-link-accountList"));
		
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		a.moveToElement(hover).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> yourLists = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(yourLists.size());
		
		for(WebElement w : yourLists ) {
			System.out.println(w.getText());
		}
		
		driver.quit();
	}

}
