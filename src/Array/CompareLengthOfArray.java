package Array;

public class CompareLengthOfArray {

	public static void main(String[] args) {

		int[] a = { 1,2,3,4,5,6,7};
		int[] b= {1,2,3,4};
		boolean result = numbers(a,b);
		System.out.println("The result is: " +result);
	}
		public static boolean numbers(int[] a, int[] b) {
			if (a.length == b.length) {
				return true;
			} else {
				return false;
			}
		}

	

}
