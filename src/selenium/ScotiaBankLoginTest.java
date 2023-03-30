package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//Classname objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();//open firefox
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=mZBRj75wigI&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoibVpCUmo3NXdpZ0kiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0OTAxNDk1MSwiaWF0IjoxNjQ5MDEzNzUxLCJqdGkiOiJmMDhkYmQ1MS02Njg4LTQ3OTEtYjE2MS0xNjVkMzJiZGIwYmYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.Wz42g7ZommCWho511Xf2Urbm29QKaouiWOuxTbXJkKJMXEKnSxrH7ifwhEbu0hZGYw3UukWKTSCjpQvZNFNn6GkxZ2-wPMjXDZOalMP6CaIJ1z59yJQYTfvY8nSuvzbELSoqoUxTHj9B2JhBI_FjJIQfewFbjHeoWYNMSE9-9Xr6kxloEO0nshJOQlperjgQMB2FkO4z4cR3lfgyx8cZUsVOyCEX8Cl2MJlHCKk5nZ-nK-zGrVXIjY0kNYpPWQ2A-2YZa84_EWVWTgsDw59GersR2iyIIZT2ZDvY9LzKlfteFiYRwg1RIe9PABS2KjZsOri2va8_wts7MZL9iURwqw&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("Binal$123");
		driver.findElement(By.id("password-input")).sendKeys("12345nb##");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
		
		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);

		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		
	
	}
}
	
