package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.switchTo().frame(0);
	
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.getText());
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		wait.until(ExpectedConditions.textToBePresentInElement(droppable, "Dropped!"));
		System.out.println(droppable.getText());
		
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}

