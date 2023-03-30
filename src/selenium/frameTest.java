package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable=driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("Sortable Present");
			}else {
				System.out.println("Sortable Not Present");
			}
		
		List<WebElement> draggable=driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
			}else {
				System.out.println("draggable Not Present");
			}
		
		driver.switchTo().frame(0);//index
		//driver.switchTo().frame("demo-frame");//This is for id and name. In this case we don't have id or name 
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//web Element
		
		System.out.println("-------------------After Switching to Frame-----------------------------------------------------");
		
		sortable=driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if(sortable.size()>0) {
			System.out.println("Sortable Present");
			}else {
				System.out.println("Sortable Not Present");
			}
		
		draggable=driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
			}else {
				System.out.println("draggable Not Present");
			}
		driver.switchTo().defaultContent();
		System.out.println("-------------------After Switching to Main Page-----------------------------------------------------");
		
		sortable=driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if(sortable.size()>0) {
			System.out.println("Sortable Present");
			}else {
				System.out.println("Sortable Not Present");
			}
		
		draggable=driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
			}else {
				System.out.println("draggable Not Present");
			}
		
	}

}
