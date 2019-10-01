package FibonacciSeries;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f=1,s=1,t;
		t=0;
		System.out.println("1 1");
		 while (t<=10) {
			t=f+s;
			System.out.println(t + " ");
			f=s;
			s=t;
			
		}
		
	}

}
