package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");
		
		//WebElement rightpanel=driver.findElement(By.xpath("//div[@class='bd']"));
		WebElement rightpanel=driver.findElement(By.xpath("//div[@class='bd']/div[1]"));
		List<WebElement> TrendingLists=rightpanel.findElements(By.tagName("a"));
		System.out.println(TrendingLists.size());
		
		for(int i=0; i<TrendingLists.size(); i++) {
			System.out.println(TrendingLists.get(i).getText());
		}
	}

}
//div[@class='bd']/div[1]//a
