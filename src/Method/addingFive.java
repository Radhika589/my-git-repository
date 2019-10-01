package Method;

public class addingFive {
	public static void main (String args []) {
		// calling a method - method calling statement 
	
		addNumberFive(1); // prints 6
		addNumberFive(10); // prints 15
	}
		// creating a method definition or defining a method 
		
          public static void addNumberFive (int x) {
        	  System.out.println (x +5 );
          }

}
