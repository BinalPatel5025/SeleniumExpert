package tests;

import java.util.Scanner;

import graphql.Assert;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] name = s.nextLine().toCharArray();
		
		for(int i=name.length-1;i>=0;i--) {
			System.out.print(name[i] + " ");
		}
		
		Assert.assertTrue(3>2);
		
		
		

	}

}
