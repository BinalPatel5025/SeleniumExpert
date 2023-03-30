package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		//size and text of highlighted list
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement facebookFooter=driver.findElement(By.xpath("//div[@id='pageFooterChildren']//li"));
		List<WebElement> facebookFooterList=facebookFooter.findElements(By.tagName("a"));
		System.out.println("Total Number of Facebook header List : " +facebookFooterList.size());
		
		for(int i=0;i<facebookFooterList.size();i++) {
			System.out.println(facebookFooterList.get(i).getText());
		}
			

	}

}
//ul[contains(@class,'uiList pageFooterLinkList')]/li

//List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));

//List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));
//System.out.println(allLinks.size());
//
//for(int i=0; i<allLinks.size();i++) {
//	System.out.println(allLinks.get(i).getText());
//}
