package Array;
import java.util.Arrays;

public class SortNumbersString {

	public static void main(String[] args) {
		int[] number = {23,76,56,908,2,456,2344};
		String[] name = {"radhika","boomika","karnesh","rishi"};
	// for arranging in ascending order, use Arrays.sort(variable name)	
Arrays.sort(number);
// to display the sorted number, use +Arrays.tostring(number)
System.out.println("The sorted number is :" +Arrays.toString(number));
Arrays.parallelSort(name);
System.out.println("The sorted name is: " +Arrays.toString(name) );
	}

}
