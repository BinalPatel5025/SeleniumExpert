package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itr = allWindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(parentWindow);//Window handels
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());//Help Page
		driver.close();//Close only current window
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());//Gmail Page
		
		driver.quit();//Kill the driver , can notuse driver after calling quite,close both  windows
		
		
	}

}
