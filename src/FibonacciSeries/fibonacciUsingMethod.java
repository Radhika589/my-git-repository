package FibonacciSeries;

import java.util.Scanner;

public class fibonacciUsingMethod {
    public static void main (String args []) {
	// getting the input from the user using importing scanner
    // Calling the method fibonacci()
    	
    	fibonacci(); 
    	
    }
    
    // Defining the method
    public static void fibonacci() {
    	   int f=1,s=1,t=0,n;
    	   Scanner sc = new Scanner (System.in);
    	   System.out.println("Enter the number:");
    	// nextInt() reads the number given by user and stores in the variable `n´
    	   n= sc.nextInt();
    	   System.out.println("1 1");
	 while (t<=n) {
			t=f+s;
		if (t>=n) 
				break;
			System.out.println(t + " ");
			f=s;
			s=t;
		
    }
}
}