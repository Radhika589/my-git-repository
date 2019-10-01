package Array;

public class PassingArguments {

	public static void main(String[] args) {
		String a ="false";
		String b ="true";
		String c ="true";
		String d ="true";
       boolean newvalue = allAreFalse(a,b,c,d);
       System.out.println(newvalue);
       boolean value = allAreTrue(a,b,c,d);
       System.out.println(value);
	}
public static boolean allAreFalse(String a,String b,String c,String d) {
	if (a.equals("false") || b.equals("false") || c.equals("false") || d.equals("false")) {
	   return true;	
	 } else {
	return false;
	 }
}
public static boolean allAreTrue(String a,String b,String c,String d) {
		if (a.equals("true") || b.equals("true") || c.equals("true") || d.equals("true")) {
		   return true;	
		 } else {
		return false;
		 }
}
}
