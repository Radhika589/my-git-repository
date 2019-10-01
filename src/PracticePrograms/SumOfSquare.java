package PracticePrograms;
import java.util.Scanner;
public class SumOfSquare {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number");
		int total = 0;
		for(int i = 0;i<5;i++) {
			int n = sc.nextInt();
//comment the sq statement if we have find the multiply of all the entered numbers			
//change total=n*total and initialize the total value as '1'
			int sq = n*n;
			total = sq + total;
		}
		
     System.out.println("Sum of the square root of the numbers:" +total);
     
	}

}
