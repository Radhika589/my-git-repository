package PracticePrograms;
import java.util.Scanner;
public class FiveIntegers {

	public static void main(String[] args) {
		// to add five integers and display the total
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the number");
	    
		int total = 0; // total should be declared outside the loop because total is used in println statement.
		for(int i=0;i<4;i++) {
			
	    int n = sc.nextInt();// this statement should come within the for loop not outside the for loop.

// for mulitplication use * symbol instead of + and change the initial value of total as 1 instead of 0			
			
	    total = total + n;  
		}
		
		System.out.println(total);

	}

}
