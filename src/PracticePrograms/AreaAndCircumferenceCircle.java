package PracticePrograms;
import java.util.Scanner;
public class AreaAndCircumferenceCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r = sc.nextDouble();
		double area = 3.14 * r * r;
		System.out.println();
		System.out.println("Area of the circle is:" +area);
		double cir = 2*3.14*r;
		System.out.println();
		System.out.println("Circumference of the circle is:" +cir);

	}

}
