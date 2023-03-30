package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//Classname objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();//open firefox
		driver.get("https://www.facebook.com/");//open facebook
		
		//1.Classname - class Attribure - not work directly - if it has space 
		//driver.findElement(By.className("inputtext _55r1 inputtext _1kbt _9ay4 inputtext _1kbt")).sendKeys("dfgshjdgfhs");
		
		//2. CSS selector - Need to learn syntax
		//driver.findElement(By.cssSelector(null));
		
		//3.Id - Working
		//driver.findElement(By.id("email")).sendKeys("bb@gmail.com");
		
		//4. LinkText - This option we only use for links
		//driver.findElement(By.linkText(null));
		
		//5. name working - for name attribute
		driver.findElement(By.name("email")).sendKeys("bb@gmail.com");
		
		//6. partialLinkText - only for links - not for this case
		//driver.findElement(By.partialLinkText(null));
		
		//7. tagname - Not working , Not unique
		//driver.findElement(By.tagName("input")).sendKeys("bb@gmail.com");
		
		//8. xpath - need to learn syntax
		//driver.findElement(By.xpath(null));
		
		}

}
