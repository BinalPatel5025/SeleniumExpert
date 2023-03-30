package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("About")).click();
		
		//Thread.sleep(3000);
	
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());//Google About Page
		
		driver.navigate().back();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle());//Google Main page

		driver.navigate().forward();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());//Google About Page again
		
		
	
		
		
		
		
	}

}
