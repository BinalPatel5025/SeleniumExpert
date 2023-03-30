package tests;

public class Test1 {
	
	static Test1 obj1 = new Test1();

	public static void main(String[] args) {
		
		india();
		obj1.canada();
		
		

	}
	public static void india() {
		System.out.println("India");
		obj1.canada();
	}
	
	public void canada() {
		System.out.println("canada");
		//india();
	}

}
