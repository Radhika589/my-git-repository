package Method;
import java.util.Scanner;

public class userDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		enteringTheDetails();
		enteringTheDetails();
		enteringTheDetails();
		enteringTheDetails();
	  }
	
	   public static void enteringTheDetails() {
		   
		   int age; String name ;
		   
		   Scanner sc = new Scanner(System.in);
		
	     System.out.println("Enter age: ");
	     age = sc.nextInt();
	
	     System.out.println("Enter name: ");
	     name = sc.next();
	
	     System.out.println("Welcome to our Page");
	     
	   }
}

