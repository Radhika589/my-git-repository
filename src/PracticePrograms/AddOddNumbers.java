package PracticePrograms;
import java.util.Scanner;

public class AddOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
// declaring variables oddno and evenno		
		int oddno = 0;
		int evenno = 0;
		
		for (int i =0;i<5;i++) {
			int n = sc.nextInt();
// To check for the even number,change the condition as n%2 == 0
// Same way, if you want to add the numbers which is divisible by 7, 
// then change the condition as n%7 == 0
			
			if (n%2 != 0) {	 
// adding the odd numbers				
				oddno = oddno + n;
			} else {
// adding the even numbers				
				evenno = evenno + n;
			}
		
		}
// For even number,change the statement as "Sum of the even numbers is"	
// printing the sum of even numbers and odd numbers		
		System.out.println("sum of odd numbers is "  +oddno);
		System.out.println("Sum of even numbers is " +evenno);
// Finding the difference between odd and even number and printing the diff value.		
		System.out.println("Difference is " + (oddno - evenno));
	}
}
   