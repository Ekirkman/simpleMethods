import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner radius = new Scanner(System.in);
		System.out.println("Please enter a radius: ");
		double r = radius.nextDouble();
		System.out.println(" the area is equal to " + area(r) + " and the circumfrence is equal to " + circumfrence(r));
	}

	public static double area(double r) {
		return 3.14 * r * r;
	}

	public static double circumfrence(double r) {
		double y = 0.0;
		y = 2 * 3.14 * r;
		return y;
	}
}
