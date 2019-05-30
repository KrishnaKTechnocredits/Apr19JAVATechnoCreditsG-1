package swapanaW;

import java.util.Scanner;

/* Separate digits and characters from the user defined string */

public class NumericStringValues {

	public static void main(String[] args) {

		System.out.println("Enter the input: ");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		NumericStringValues num = new NumericStringValues();
		num.numericString(inp);
	}

	void numericString(String input) {
		String alpha = input.replaceAll("[0-9]", ""); // replaces all the numbers by spaces
		String digit = input.replaceAll("[^0-9]", ""); // replaces all the numbers by alphabets

		System.out.println("String: " + alpha);
		System.out.println("Numeric: " + digit);

	}
}