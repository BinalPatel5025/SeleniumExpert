package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// Our organization size textv 7  https://www.mississauga.ca/
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='dropdown nav-link show']//a"));
		//ul[@class='main-nav-links']/li[3]//li
		System.out.println(elements.size());
		
		Thread.sleep(3000);
		for(WebElement w : elements) {
			System.out.println(w.getText());
			
			if(w.getText().equals("Jobs and volunteer")) {
				w.click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				break;
			}
			
		}
		
		
		
		
		
	}

}
