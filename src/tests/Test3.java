package tests;

public class Test3 {
	
	static Test3 t3=new Test3();
	static myPack t1=new myPack();
	
	public static void main(String[] args) {

		circle();
		t3.	square();
		myPack.printMe();
		t1.testMe();

	}
	public static void circle() {
		System.out.println("Circle");
	}
	public void square() {
		System.out.println("square");
		
	}

}

