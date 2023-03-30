package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub Type iphone 12
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		Thread.sleep(2000);
		
		
		//List<WebElement> element=driver.findElements(By.xpath("//div[@id='gAC']/ul/li"));
		List<WebElement> element=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")); // or can use role xpath
		System.out.println(element.size());
		
		
		for(WebElement w : element) {
			System.out.println(w.getText());
			}

}
}
