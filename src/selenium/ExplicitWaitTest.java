package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.name("B2")).click();
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
		
		

	}

}
