package tests;

public class ForLoopTest {

	public static void main(String[] args) {
		
	/*System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
	System.out.println(8);
	System.out.println(9);
	System.out.println(10);*/
		
	/*
	 3 condition
	 intialization=from where you want to start
	 condition=where you want to close
	 incremet/decrement
	 for will execute the code untill condition is true
	 
	 */
		for(int i=1; i<=10 ; i++) {
			System.out.println(i);
			
			if(i==5) {
				System.out.println("Got 5");
				break;
			}
		}

	}
}
