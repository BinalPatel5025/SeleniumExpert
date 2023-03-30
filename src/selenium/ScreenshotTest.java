package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
		//File scrFile = ((TakesScreenShot)driver).getScreenShotAs(OutPuttype.File); // This line Is for Webdriver
		FileUtils.copyFile(screenShotFile, new File("C:\\testing\\s.png"));

	}

}
