package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMhover {

	public static void main(String[] args) throws InterruptedException {
		// 7 hover on hello
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(3000);
		driver.switchTo().frame("intercom-borderless-frame");
		
		List<WebElement> hover = driver.findElements(By.xpath("//div[@class='intercom-19gqqlk e13xul2n4']//span"));
		System.out.println(hover.size());
		if(hover.size()>0) {
			WebElement e = driver.findElement(By.xpath("//div[@class='intercom-19gqqlk e13xul2n4']//span"));
			e.click();
		
		
		}
		
		/*
		 * Actions a=new Actions(driver);
		 * a.moveToElement(hover).click().build().perform();
		 */
		//Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("username")).sendKeys("gdcvfdsf");
	
		/*
		 * List<WebElement> yourLists =
		 * driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		 * System.out.println(yourLists.size());
		 * 
		 * for(WebElement w : yourLists ) { System.out.println(w.getText()); }
		 * 
		 * driver.quit();
		 */
	}

}
