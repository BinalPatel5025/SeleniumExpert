package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
//		WebElement first=driver.findElement(By.tagName("a"));//Web Element
//		first.click();
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));//List of web Element
		System.out.println(allLinks.size());
		
		System.out.println(allLinks.get(0).getText());//
		//System.out.println(allLinks.get(0)); 0nly give you web element
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
	
			
		/* fooooooooooooooooooter
		 * 	WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
			List<WebElement> allLinks = footer.findElements(By.tagName("a"));   //List of webElements
			System.out.println(allLinks.size());
			
			for(int i=0; i<allLinks.size(); i++) {
				System.out.println(allLinks.get(i).getText());
			}*/
			
		/*Xpathhhhhhhhhhhhhhhhh
	
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));   //List of webElements
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}

		 * */
		


		}
		
		
	}

}
