package tests;

public class ArrayTest {

	public static void main(String[] args) {
		
		String tool = "Selenium";
		System.out.println(tool);
		
		String tools[] = {"Selenium" , "Java" , "Testing" , "Junit" , "Git"};
		System.out.println(tools.length);
		
		/*System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);*/
		
		/*for(int i=0;i<=2;i++) {
			System.out.print(tools[i]);
		}*/
		System.out.println();
		for(int i=0;i<tools.length;i++) {
			System.out.print(tools[i]);
		}
		System.out.println("-----------------------------------------------");
		int a[] = {1,5,8,19,100};
		System.out.println(a.length);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------------------------");
		Object b[] = {"testing",10, 'c'};
		System.out.println(b.length);
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}

	
		}

}
