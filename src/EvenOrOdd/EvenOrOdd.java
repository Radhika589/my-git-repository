package EvenOrOdd;

import java.util.Scanner;

class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enther the number");
	    int n = sc.nextInt();
		boolean result = evenorodd (n);	
		if (result == true) {
			System.out.println ("The number is even");
		} else {
				System.out.println ("The number is odd");
			}
		}
		
public static boolean evenorodd (int n)	{
		if (n % 2 ==0 ) {
			return true;
		}  else  {
			return false;
			}
		}
}

	
