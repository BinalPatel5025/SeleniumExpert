package tests;

public class ConditionTest {

	public static void main(String[] args) {
			
		int a=20;
		int b=20;
		
		if(a==b) {
			System.out.println("a and b are equal");
		}else {
			System.out.println("a and b are not equal");
		}
		/*
		  If condition is true than it execute first
			statement and if it is false than execute
			else statement
		 */
		String expected = "Selenium";
		String actual = "Selenium";
		//equals is method from string class
		if(expected.equals(actual)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
			
		
	}

}
