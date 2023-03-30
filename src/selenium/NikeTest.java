package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		//hover on men and print size and text sec coloum https://www.nike.com/ca/
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		WebElement Hover = driver.findElement(By.linkText("Men"));
		
		Thread.sleep(3000);
		
		Actions performHover = new Actions(driver);
		performHover.moveToElement(Hover).build().perform();
		
		List<WebElement> Men =driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		//List<WebElement> Men =driver.findElements(By.xpath("//a[contains(@data-path,'men:shoes')]"));
		System.out.println(Men.size());
		
		Thread.sleep(2000);
		
		/*for(int i=0;i<Men.size();i++) {
			System.out.println(Men.get(i).getText());
		}*/
		
		for(WebElement a : Men ) {
			System.out.println(a.getText());
		}
	}

}
