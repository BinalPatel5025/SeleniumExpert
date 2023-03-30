package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//we can not verify if element is present or not , using webelement. WebElement must be present
		/*if(driver.findElement(By.linkText("logdfsdfgut")).isDisplayed()){
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}*/
		
		List<WebElement> element=driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
			}else {
				System.out.println("Element Not Present");
			}
		
}

}
