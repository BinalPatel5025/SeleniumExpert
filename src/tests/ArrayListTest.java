package tests;

import java.util.ArrayList;//import Arraylist class

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> tools=new ArrayList<String>();//create Arraylist object
		
		tools.add("Selenium");
		tools.add("Java");
		tools.add("Junit");
		tools.add("TestNG");
		
		System.out.println(tools.size());//4
		tools.add("Git");
		System.out.println(tools.size());//5
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		System.out.println(tools.get(4));
		
		tools.remove(2);//remove Junit
		System.out.println(tools.size());//4
		System.out.println(tools.get(2));//TestNG
		
		System.out.println("--------------------------------------");
		/*for(int i=0;i<tools.size();i++) {
			System.out.println(tools.get(i));
		}*/
		
		for(String s : tools) {
			System.out.println(s);
		}
	}

}
