package swapanaW;

import java.util.Scanner;

//separate numeric and string value from the array

public class SeparateNosDig {

	public static void main(String[] args) {

		System.out.println("Please enter the input values: ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(); // Accepts the complete line

		String[] temp = line.split(" ");
		new SeparateNosDig().numDigits(line);
	}

	void numDigits(String line) {
		String alpha = "";
		String digit = "";
				
		for (int i = 0; i < line.length(); i++) {
			if (Character.isAlphabetic(line.charAt(i))) {
				alpha = alpha + line.charAt(i);
			} else if (Character.isDigit(line.charAt(i))) {
				digit = digit + line.charAt(i);
			}
		}
		System.out.println("String: " + alpha);
		System.out.println("Numeric: " + digit);
	}
}