package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("sdgsdrhsryr");
		driver.findElement(By.name("reg_email__")).sendKeys("6475688679");
		driver.findElement(By.id("password_step_input")).sendKeys("sgsrfhsthhtsegr");
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select s=new Select(month);
		s.selectByIndex(6);//select july
		//......................................................................................
		WebElement date=driver.findElement(By.id("day"));
		Select o=new Select(date);
		o.selectByValue("20");//Select Date 20
		//......................................................................................
		WebElement year=driver.findElement(By.id("year"));
		Select p=new Select(year);
		p.selectByVisibleText("2000");//Select year 2000
		//...........................................................................................
		List<WebElement> radiolist=driver.findElements(By.xpath("//input[@name='sex']"));
		radiolist.get(0).click();
		//select radio button
		driver.findElement(By.name("websubmit")).click();

				
		String expectedErr = "What’s your name?";
		System.out.println(expectedErr);
		
		String actualErr = driver.findElement(By.xpath("//*[text()='What’s your name?']")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)){
			System.out.println("pass");
		}else
		{
			System.out.println("Fail");
		}
		
	}
	
	
	

}
