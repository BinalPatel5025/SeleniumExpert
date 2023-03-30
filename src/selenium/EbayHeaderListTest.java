package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderListTest {

	public static void main(String[] args) {
		// size and Text
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca");
		
		//WebElement eBayheader=driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li"));
		//List<WebElement> eBayheaderList=eBayheader.findElements(By.tagName("a"));
		List<WebElement> eBayheaderList=driver.findElements(By.xpath("//div[@id='mainContent']/div[1]/ul/li"));
		System.out.println("Total Number of ebay header List : " +eBayheaderList.size());
		
		for(int i=0;i<eBayheaderList.size();i++) {
			System.out.println(eBayheaderList.get(i).getText());
		}
			
		
	}

}
////div[@id='mainContent']/div[1]/ul/li
//All
