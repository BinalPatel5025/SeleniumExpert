package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-email")).sendKeys("bbb@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("bb22!!!");	
		driver.findElement(By.id("login-password")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		String expected = "Your request timed out – please retry";
		String actual = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

		
				
	}

}
