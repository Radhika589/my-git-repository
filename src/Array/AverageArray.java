package Array;
import java.util.Scanner;
public class AverageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		double[] a=new double[n];
		System.out.println("Enter the elements");
		double average=calculateAvg(a,n);
 
	}
	public static double calculateAvg(double []a,int n) {
		double sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
			sum= sum + a[i];						
		}
		System.out.println("The sum is:" +sum);
		double avg= sum/n;
		System.out.println("The average is:" +avg);
		return avg;
	}

}
