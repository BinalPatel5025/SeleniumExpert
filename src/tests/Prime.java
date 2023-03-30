package tests;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		boolean flag = false;;
		int number;
		int i;
		
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		
		for(i=2;i<=number/2;i++) {
			if(number%i == 0) {
				flag = true;
				break;
			}
		}
		if(flag!=true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
