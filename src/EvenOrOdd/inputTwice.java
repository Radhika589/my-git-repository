package EvenOrOdd;
import java.util.Scanner;

public class inputTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean res= true;
String temp = "";
while(res) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter a text");
    String str1 = sc.next();
    System.out.println("you have entered" +str1);
    if (temp == "") {
    	System.out.println("Enter a text");
    	String str2 = sc.next();
    	System.out.println("you have entered" +str2);
    	temp = str2;
    	
    	if(str1.equals(temp)) {
    		System.out.println ("You have entered" + str2 + "twice");
    		res=false;
    	}
    	} else {
    	if(str1.equals(temp)) {
        		System.out.println ("You have entered" + temp + "twice");
        		res=false;

    }
}

	}

}
}