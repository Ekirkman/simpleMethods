import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in a letter :");
		
		String x = input.nextLine();
		
		System.out.println(" The numerical value of " + x + " is " + alphabet(x));
		
	}

	public static int alphabet(String x) {

		char letter = x.charAt(0);

		int nValue = ((int) letter);

		return nValue;
	}

	

	
}
