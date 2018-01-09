import java.util.Scanner;

public class round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number : ");
		Scanner round = new Scanner(System.in);
		double w = round.nextDouble();
		System.out.println(Rounding(w));

	}

	public static int Rounding(double x) {

		int y = ((int) x);

		if (x - y >= .5) {

			return y + 1;
		}
		return y;
	}
}
