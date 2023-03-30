package seelnium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://authentication.td.com/uap-ui/?consumer=easyweb&locale=en_CA#/uap/login");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("fgzudhfg");
		driver.findElement(By.id("uapPassword")).sendKeys("vbhcvvbhcv");
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-block td-button-secondary']")).click();
		
		
		
		
}

}