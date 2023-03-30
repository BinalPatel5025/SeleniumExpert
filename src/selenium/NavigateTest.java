package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://jqueryui.com/droppable/");
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		//.get() and navigate().to() both are same 
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();

	}

}
