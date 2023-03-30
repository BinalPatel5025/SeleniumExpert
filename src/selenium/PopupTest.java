package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> popUp1 = driver.findElements(By.className("btn-close"));
		System.out.println(popUp1.size());
		
		if(popUp1.size()>0) {
			popUp1.get(0).click();
		}
		
		List<WebElement> popUp2 = driver.findElements(By.className("_24EHh"));
		System.out.println(popUp2.size());
		
		if(popUp2.size()>0) {
			popUp2.get(0).click();
		}
		
		driver.findElement(By.id("search-key")).sendKeys("computer");

		
		/*List<WebElement> pop1=driver.findElements(By.xpath("//div[@class='poplayer-content']"));
		if(pop1.size()>0) {
			driver.findElement(By.xpath("//img[@class='btn-close']")).click();
			}else {
				System.out.println("pop1 Not Present");
			}
		
		//-------------------------------------------------------------------------------------------
		
		List<WebElement> pop2=driver.findElements(By.xpath("//img[@class='_24EHh']"));
		if(pop2.size()>0) {
				driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
			}else {
				System.out.println("pop2 Not Present");
			}
		
		
		driver.findElement(By.id("search-key")).sendKeys("Computer");*/
		
		
		
		
	}
	


}
