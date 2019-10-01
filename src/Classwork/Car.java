package Classwork;

public class Car {

	public String modelname;
	public int year;
	public boolean washed;
	public boolean insured;
	
	public Car(String n,int y, boolean w,boolean i) {
		modelname = n;
		year = y;
		washed = w;
		insured = i;
		System.out.println("The model name is  " +modelname);
		System.out.println("The year made is " +year);
	}


}
