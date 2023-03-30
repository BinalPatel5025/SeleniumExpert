package tests;

//we do not create object for static method	
	/*
	 Static Method
  - No Object
  - ClassName.methodName();
  - methodName(); (Only when calling into same class)
  
Non-Static Method
   - Always through Object
	 */
	public class Test2 {
		
		public static void red() {
			System.out.println("Red");
		}
		
		public void blue() {
			System.out.println("blue");
		}
		
		//method,name same as class name and no return type
		public Test2() {
			System.out.println("I'm a Constructor");
		}

	}

	


