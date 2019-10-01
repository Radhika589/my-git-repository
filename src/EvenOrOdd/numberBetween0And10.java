package EvenOrOdd;
import java.util.Scanner;

public class numberBetween0And10 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean result = Between0And10();
	while (!result){
	result= Between0And10();
		}
	}
  public static boolean Between0And10 () {
	Scanner sc = new Scanner (System.in);
	System.out.println ("Please enter the number between 0 and 10");
	int n= sc.nextInt();
	int min = 0;
    int  max = 10;
   	
	if (n >= min && n < max) {
		System.out.println("congrats");
		return true;
		
	} else {
		System.out.println("Please enter another value");
		return false;
		
	}
}
 }
