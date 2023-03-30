package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//Classname objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("bkfbfbfbvjdfklvgjsdfklvgsdfk");
	
		driver.findElement(By.id("email")).sendKeys("gacfhjdfghjfgjsfjfdsdhjkhfg");//type wrong email address
		driver.findElement(By.id("pass")).sendKeys("dfcghfhfgdcadhfg");//type wrong password
		driver.findElement(By.name("login")).click();//click on login button
		
		
	}

}