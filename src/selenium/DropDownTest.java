package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++) {
		System.out.println(allOptions.get(i).getText() + "------" + allOptions.get(i).isSelected() );
		}
		
		WebElement box=driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(2);//select Art
		Thread.sleep(3000);
		s.selectByValue("11116");//select Coins & Paper Money
		Thread.sleep(3000);
		s.selectByVisibleText("Crafts");//select Crafts
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		System.out.println(".............................After Selection....................");
		//Last option which we selected is ture ( Crafts)
		for(int i=0; i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText() + "------" + allOptions.get(i).isSelected() );
			}
		
		}

}
