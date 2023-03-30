package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TdListTest {

	public static void main(String[] args) {
		// https://www.td.com/ca/en/personal-banking/ 8 link

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");

		WebElement tdFooter = driver.findElement(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']"));
		List<WebElement> tdFooterList = tdFooter.findElements(By.tagName("a"));
		System.out.println("No of Links on TD Foooetr : " + tdFooterList.size());

		for (int i = 0; i < tdFooterList.size(); i++) {
			System.out.println(tdFooterList.get(i).getText());
		}

	}

}

//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//FirefoxDriver driver = new FirefoxDriver(); 
//driver.get("https://www.td.com/ca/en/personal-banking/"); 
//
//List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
//System.out.println(allLinks.size());
//
//for(int i=0; i<allLinks.size();i++) {
//	System.out.println(allLinks.get(i).getText());
//}
