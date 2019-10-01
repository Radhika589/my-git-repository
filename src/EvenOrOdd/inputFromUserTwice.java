package EvenOrOdd;
import java.util.Scanner;
public class inputFromUserTwice {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

boolean res = true;
String txt = "";

while (res) {
	System.out.println("Please enter a text: ");
	String txt1= sc.next();
	
	if(txt == "") {
		System.out.println("Please enter the same text as:" + "  "   +txt1);
		String txt2 = sc.next();
		System.out.println("Please enter the same text as:" + "  "   +txt2);
		txt = txt2;

     if (txt1.equals (txt)) {
		System.out.println("Successful login");
		res =false;

		} else {
    	if(txt1.equals(txt)) {
        		System.out.println ("Enter the text again");
        		res=false;
    	}
    	}
 
}
}
}
}