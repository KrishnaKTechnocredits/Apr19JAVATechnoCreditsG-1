package sushantD.stringprograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {

		palindromeString();

	}

	static void palindromeString() {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String userinput = sc.nextLine();
		String reverse = "";

		for (int i = userinput.length() - 1; i >= 0; i--) { // comapre original string with reverse string

			reverse = reverse + userinput.charAt(i);

		}

		if (userinput.equalsIgnoreCase(reverse)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindromes");
		}
	}

}
