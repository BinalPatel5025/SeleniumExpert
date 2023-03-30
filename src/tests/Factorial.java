package tests;

public class Factorial {

	public static void main(String[] args) {
		// N! = n * (n-1)!
		
		int fact=1;
		int number = 3;
		for(int i=1;i<=number;i++) {
			
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
