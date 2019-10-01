package Array;

public class ContainsSpecificValue {

	public static void main(String[] args) {
		
		int[] numbers= {12,34,56,78,345,567,346};
	System.out.println(containsvalue(numbers,50));
	System.out.println(containsvalue(numbers,12));
	System.out.println(containsvalue(numbers,54));
	System.out.println(containsvalue(numbers,345));
	
	}

	public static boolean containsvalue(int[] numbers,int value) {
		for (int i=0;i<numbers.length;i++) {
			if (value == numbers[i]) {
				return true;
			}
		}
		return false;
	}
}
