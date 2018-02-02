import java.util.Scanner;

public class trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the height and the base of your triangle : ");
		double h = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("The area of your triangle is : " + triangle(h, b));
	}

	public static double triangle(double h, double b) {

		double a = 0.0;
		a = b * h / 2;
		return a;
	}
}
