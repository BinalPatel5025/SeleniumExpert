package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		
		sum();
		sum(6,7);
		sum(10,20,30);
	
		
	/*java know as per argument which method to call
		when we call same method*/
	}
	public static void sum() {
		
		int a=4+5;
		System.out.println(a);
	}
	public static void sum(int b,int c) {
		int a=b+c;
		System.out.println(a);
	}
	public static void sum(int b,int c,int d) {
		int a=b+c+d;
		System.out.println(a);
	}

}
