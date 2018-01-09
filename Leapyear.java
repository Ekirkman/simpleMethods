import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println(year + " is " + Leap(year));

	}

	public static String Leap(int year) {
		String l = new String(" A Leap year");
		String nl = new String("Not a leap year");
		if (year % 4 == 0 || year % 400 == 0) {
			return l;
		} else
			return nl;
	}
}
