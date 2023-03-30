package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			String url = links.get(i).getAttribute("href");
			
			URL link = new URL(url);//code below will retrieve the href of the anchor 
									//tag and store it in the URL variable.
			HttpURLConnection httpconn =(HttpURLConnection)link.openConnection();
			//Now we will be creating url connection and getting the response code
			httpconn.connect();
			
			int rescode = httpconn.getResponseCode();
			
			if(rescode>=400) {
				System.out.println(url + " - Broken");
				
			}else {
				System.out.println(url + " - valid");
			}
			
			
		}
		

	}

}

/*
 * A broken link, often called a dead link, is any link on a web page that no
 * longer works because there is an underlying issue with the link. When someone
 * clicks on such a link, sometimes an error message is displayed like a page
 * not found.
 */

/*
 * Use the following steps to identify broken links in Selenium
 * 
 * Collect all the links present on a web page based on the <a> tag 
 * Send HTTP request for each link Verify the HTTP response code 
 * Determine if the link is valid or broken based on the HTTP response code 
 * Repeat the process for all links captured with the first step
 */
