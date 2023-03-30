package tests;

import java.util.Scanner;

public class Prime_BTW {

	public static void main(String[] args) {
		
		int number1 , number2;
		int i,j;
		
		Scanner s = new Scanner(System.in);
		number1 = s.nextInt();
		number2 = s.nextInt();
		
		for(i=number1;i<=number2;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0) 
					break;
				}
				if(i==j) {
					System.out.print(j + " ");
			}
		}
	}

	

}
