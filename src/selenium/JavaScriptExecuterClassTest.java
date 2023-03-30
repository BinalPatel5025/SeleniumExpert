package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(10000);
		
		System.out.println( driver.getTitle());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement Careers = driver.findElement(By.linkText("Careers"));
		
		//option 1 - Using x and Y cordinate
//				System.out.println(Careers.getLocation());
//				jse.executeScript("window.scrollBy(0,5000)");
//				Careers.click();
				
		//option 2 - Scroll untill the element is in the view is true
//			jse.executeScript("arguments[0].scrollIntoView(true);",Careers);
//			Careers.click();
		
		//Option 3 - Direct click using executor
		jse.executeScript("arguments[0].click();",Careers);
		String s = driver.getTitle();
		System.out.println(s);
		//jse.executeScript("arguments[0].value='dfsdfsdfsdf'",Careers);


	}

}
