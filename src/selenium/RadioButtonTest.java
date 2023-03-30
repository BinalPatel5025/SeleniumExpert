package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> radioList=driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(radioList.size());
		
		for(int i=0;i<radioList.size();i++) {
			
		
			if(radioList.get(i).isSelected()==true) {
				System.out.println(radioList.get(i).getAttribute("value") + "-------" + radioList.get(i).isSelected());
			
			//System.out.println(radioList.get(i).getAttribute("value") + "-------" + radioList.get(i).isSelected());
			//print all value ang give result it is selected or not
			}
		}
		
//		WebElement option1 = driver.findElement(By.xpath("//input[@value='Cheese']"));
//		option1.click();
		
		radioList.get(2).click();
		System.out.println("-----------------------");

		for(int i=0;i<radioList.size();i++) {
		if(radioList.get(i).isSelected()==true) {
			System.out.println(radioList.get(i).getAttribute("value") + "-------" + radioList.get(i).isSelected());
		
		//for(int i=0;i<radioList.size();i++) {
			//System.out.println(radioList.get(i).getAttribute("value") + "-------" + radioList.get(i).isSelected());
			}
		

	}

}
}
