package EvenOrOdd;
import java.util.Scanner;
public class twoIntegers {
public static void main(String[] args) {
	double f1 =getIntegers();
	double f2 =getIntegers();
	double average = calculateMean(f1,f2);
}	 
  public static double getIntegers() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter the number:");
	double number = sc.nextDouble();
	return number;	
}		
  public static double calculateMean (double f1, double f2) {	
	double	mean = ((f1 + f2) / 2 );
    System.out.println("The mean is:" +mean);
    return mean;
     
	}
	
}
