package PracticePrograms;

public class SumAverageArray {

	public static void main(String[] args) {
		 double[] numbers = {1.9,2,3,4.56,5,6,3.4};
		 double sum= 0;
		 double average;
// instead of for(i=0;i<numbers.length;i++),we can use for..each loop
//ie for(double i:numbers) 
		 
		 for (double i: numbers) {
			 sum = sum + i; 
		 }	 
		 average = sum/numbers.length;
		 System.out.println("The sum is " +sum);
		 System.out.println("Average is " +average);

	}

}
