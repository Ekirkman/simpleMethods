import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int y = input.nextInt();
		System.out.println(" The number " + y + " is a " + even(y) + " number.");
	}

	public static String even(int x) {
		String E = new String("Even");
		String O = new String("Odd");

		if (x % 2 == 0) {

			return E;
		}

		return O;
	}
}
