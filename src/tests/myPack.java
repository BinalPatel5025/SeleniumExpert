package tests;

import selenium.Test4;

//import selenium.Test4;

public class myPack {
		//className objName = new ClassName();
		static myPack t1 = new myPack();
		static Test2 t2 = new Test2();
		static Test3 t3 = new Test3();
		static Test4 t4 = new Test4();

		public static void main(String[] args) {
			
			System.out.println("I'm in main method");
			myPack.scanMe();
			printMe();
			System.out.println("After main method");
			t1.testMe();
			t1.paintMe();
			Test2.red();
			t2.blue();
			Test3.circle();
			t3.square();
			/*when you want to call method which is not in same package 
			you need to import*/
			Test4.bmw();
			t4.audi();
			ArgumentsTest.sum(100,200);
			

		}
		
		public static void printMe() {
			System.out.println("printMe");
		}
		
		public static void scanMe() {
			System.out.println("scanMe");
		}
		
		public void testMe() {
			System.out.println("testMe");
			printMe();
		}
		
		public void paintMe() {
			System.out.println("paintMe");
		}

}
	
	/*className objName = new ClassName();
		static Test1 t1 = new Test1();
		static Test2 t2 = new Test2();
		do we need to write static keyword while creating obj , if we declare obj in main method?


		public static void main(String[] args) {
			
			System.out.println("I'm in main method");
			Test1.scanMe();
			printMe();
			System.out.println("After main method");
			t1.testMe();
			t1.paintMe();
			Test2.red();
			t2.blue();

		}
		
		public static void printMe() {
			System.out.println("printMe");
		}
		
		public static void scanMe() {
			System.out.println("scanMe");
		}

	}
	public static void printMe() {
		System.out.println("printMe");
	}
	// U can not create method inside method
	public static void scanMe() {
		System.out.println("scanMe");
		
	}
	public void testMe() {
		System.out.println("testMe");
	}
	
	public void paintMe() {
		System.out.println("paint me");
	}
}*/
