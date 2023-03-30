package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooheaderListTest {

	public static void main(String[] args) throws InterruptedException {
		// tesxt and sizev
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");	
		
//		WebElement header=driver.findElement(By.xpath("//div[contains(@id,'ybar-navigation')]"));
//		WebElement header=driver.findElement(By.xpath("//div[@id='ybar-navigation']"));
		WebElement header=driver.findElement(By.xpath("//ul[@role='presentation']"));
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		System.out.println("Number of Links on yahoo header : " + headerLinks.size());
	
		for(int i=0;i<headerLinks.size();i++) {
			System.out.println(headerLinks.get(i).getText());
		}
		
		}

}
//ul[@role='presentation']/li/a
