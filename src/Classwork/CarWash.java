package Classwork;
import java.util.Scanner;
public class CarWash {
	public static void main (String args[]) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the model name");
		String n = sc.next();
		
		System.out.println("Enter the year made");
		int y = sc.nextInt();
		
		System.out.println ("Is the car washed");
		boolean w = sc.hasNext();
		
		System.out.println ("Is the car insured");
		boolean i = sc.hasNext();
		
		Car c = new Car (n,y,w,i);
		if (! c.insured ) {
			System.out.println("The car cannot be washed");
			
		} else if ( c.insured && c.washed) {
			System.out.println("It is already washed");
			
		} else {
			c.washed = true;
			System.out.println ("The car has been washed");
		}
		
	}
	

}
