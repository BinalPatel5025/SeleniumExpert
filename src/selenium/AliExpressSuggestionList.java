package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AliExpressSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//computer size text 10
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		//popUp 1 to close
		List<WebElement> popUp1 = driver.findElements(By.className("btn-close"));
		System.out.println(popUp1.size());
		
		if(popUp1.size()>0) {
			popUp1.get(0).click();
		}
		
		//PopUp 3 Close
		List<WebElement> popUp3 = driver.findElements(By.className("close-btn"));
		System.out.println(popUp3.size());
		
		if(popUp3.size()>0) {
			popUp3.get(0).click();
		}
		
		//PopUp 2 Close
				List<WebElement> popUp2 = driver.findElements(By.className("_24EHh"));
				System.out.println(popUp2.size());
				
				if(popUp2.size()>0) {
					popUp2.get(0).click();
				}
		
		//type computer and get size and text
				
				driver.findElement(By.id("search-key")).sendKeys("computer");
				
				Thread.sleep(3000);
				
				List<WebElement> allList = driver.findElements(By.xpath("//ul[@data-role='items']/li"));
				System.out.println(allList.size());
				
				for(WebElement w : allList) {
					System.out.println(w.getText());
				}
		
		
	}

}
