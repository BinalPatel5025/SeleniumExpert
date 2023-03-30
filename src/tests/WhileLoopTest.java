package tests;

public class WhileLoopTest {

	public static void main(String[] args) {
		/*
		 Int,cond,inc in different line
		 */
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			//i++; // will not print 5
			if(i==5) {
				System.out.println("Got 5");
				break;
			}
			i++;//will print 5
		}

	}

}
