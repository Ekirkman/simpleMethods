import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner count = new Scanner(System.in);
		int f = count.nextInt();
		System.out.println("Your new number is :  " + number(f));
	}

	public static double number(int x) {
		double y = 1.0;
		double s = x * y;
		return s;
	}

}
