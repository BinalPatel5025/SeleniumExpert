package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AliExpressHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		//size and test first column
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
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
				
		
		
		//Hover on Women's Fashion
		WebElement womenfashionHover = driver.findElement(By.linkText("Women's Fashion"));
		
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		a.moveToElement(womenfashionHover).build().perform();
	
		
		Thread.sleep(6000);
		
		
		//print size
		
		List<WebElement> allList = driver.findElements(By.xpath("(//div[@class='sub-cate-row'])[1]//a"));
		wait.until(ExpectedConditions.visibilityOfAllElements(allList));
		System.out.println(allList.size());

		
		for(WebElement w : allList) {
			System.out.println(w.getText());
		}
		driver.quit();
		
		
		
	}
	

}
