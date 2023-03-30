package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		

	}

}
