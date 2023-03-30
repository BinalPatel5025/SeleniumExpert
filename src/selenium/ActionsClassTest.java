package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca");
		
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(electronics).build().perform();//don't move your mouse untill excution
		
		Thread.sleep(2000);
		
		
		List<WebElement> eBayCategoriesList=driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println("Total Number of top categories List : " +eBayCategoriesList.size());
		
		/*for(int i=0;i<eBayCategoriesList.size();i++) {
			System.out.println(eBayCategoriesList.get(i).getText());
		}*/
		
		for(WebElement a: eBayCategoriesList) {
			System.out.println(a.getText());
		}
		
		
		
		
	}

}
