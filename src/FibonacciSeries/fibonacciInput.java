package FibonacciSeries;
import java.util.Scanner;

public class fibonacciInput {
    public static void main (String args []) {
	// getting the input from the user
    	
    	int f=1,s=1,t=0,n;
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter the number:");
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