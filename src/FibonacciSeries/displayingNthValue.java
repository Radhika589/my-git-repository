package FibonacciSeries;
import java.util.Scanner;

public class displayingNthValue {

 public static void main(String[] args) {

  int n, num1 = 0, num2 = 1;

  Scanner s = new Scanner(System.in);
  System.out.print("Enter value of n:");
  n = s.nextInt();
// the method fibonacci will be executed and saved in the variable "nthNumber"
  int nthNumber = fibonacci(n);
  System.out.println(n + "th number in the fibonacci series: " + nthNumber);
 }

 private static int fibonacci(int number) {
  if (number == 1 || number == 2) {
   return 1;
  }
  return fibonacci(number - 1) + fibonacci(number - 2);
 }

}
