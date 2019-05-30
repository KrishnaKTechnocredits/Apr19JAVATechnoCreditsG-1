package swapanaW;

import java.util.Scanner;

/* Reverse number as String */

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Please enter the input values: ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(); // Accepts the complete line

		for (int i = line.length() - 1; i >= 0; i--) { // iterates the loop in reverse manner
			System.out.print(line.charAt(i));
		}
	}
}