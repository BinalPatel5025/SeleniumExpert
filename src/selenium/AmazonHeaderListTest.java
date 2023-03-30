package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderListTest {

	public static void main(String[] args) {
		//size and Text
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.ca");
		
		WebElement amazonheader=driver.findElement(By.xpath("//div[@id='nav-main']"));
		List<WebElement> amazonheaderList=amazonheader.findElements(By.tagName("a"));
		System.out.println("Total Number of ebay header List : " +amazonheaderList.size());
		
		for(int i=0;i<amazonheaderList.size();i++) {
			System.out.println(amazonheaderList.get(i).getText());
		}
			

	}

}

//List<WebElement> alllinks.findElements(By.)