package tests;

public class random {

	public static void main(String[] args) {
		int min = 	1;  
		int max = 50;  
		//Generate random double value from 200 to 400   
		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double a = (int)(Math.random()*(max-min+1)+min);    
		System.out.println(a);  
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		//int b = (int)(Math.random()*(max-min+1)+min);  
		double b = (int)(Math.random()*(max-min+1)+min); 
		System.out.println(b);  
		
		double c = (int)(Math.random()*(max-min+1)+min); 
		System.out.println(c);  
		
		double d = (int)(Math.random()*(max-min+1)+min); 
		System.out.println(d);  
		
		double e = (int)(Math.random()*(max-min+1)+min); 
		System.out.println(e);  
		
		double f = (int)(Math.random()*(max-min+1)+min);   
		System.out.println(f);  
		
		double g = (int)(Math.random()*(max-min+1)+min); 
		System.out.println(g);  

	}

}
