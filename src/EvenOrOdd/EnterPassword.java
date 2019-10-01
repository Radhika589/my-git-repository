package EvenOrOdd;
import java.util.Scanner;
public class EnterPassword {
public static void main(String[] args) {
	
	    isAuthorized();
	
}
  public static void isAuthorized() {
         boolean valid =true;
    	 String one= "piggy";
    	 String two = "snuff";
    	 String three = "bark";
    for (int totalattempts = 4; totalattempts >=0 ; totalattempts --) {
    		 Scanner sc = new Scanner (System.in);
    	     System.out.println ("Enter the first password");
    	     String pwd1 = sc.next();
    	     System.out.println ("Enter the second password");
    	     String pwd2 = sc.next();
    	     System.out.println ("Enter the third password");
    	     String pwd3 = sc.next();
  
    	if (pwd1.equals(one) || pwd1.equals(two) || pwd1.equals(three)) {
	    	valid =true;
	    	     }
		if (pwd2.equals(one) || pwd2.equals(two) || pwd2.equals(three)) {
			valid = true;
	   	         }
		if (pwd3.equals(one) || pwd3.equals(two) || pwd3.equals(three)){
	   		valid = true;
	   		if ((one!=two) || (two!=three) || (one!=three)){
	   			valid =true;
	   		System.out.println("Welcome");
			break; 
	   		}
	   	         } else  {
			System.out.println("Please enter the correct password");
			System.out.println("Total attempts left:" +totalattempts);
	   	         } 
    	 while (totalattempts ==1) {
    		 if (true) {
    			 System.out.println("Please give your personal number");
    			 break;
    		 }
    	 }
    
}    	 
}
     	 
}	


