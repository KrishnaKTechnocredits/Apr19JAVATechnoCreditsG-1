package swapanaW;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

//String is palindrome or not. 

public class Palidrome {

	public static void main(String[] args) {

		Palidrome pdString = new Palidrome();
		pdString.palindromeString();
	}

	void palindromeString() {
		System.out.println("Enter the input value : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String reverse = "";
		System.out.println("Input : " + input);

		for (int i = input.length() - 1; i >= 0; i--) { //reverse the string
			reverse = reverse + input.charAt(i);
		}
		System.out.println("Reverse : " + reverse);

		if (input.equalsIgnoreCase(reverse))
			System.out.println("The string is palindrome. ");
		else
			System.out.println("The string is not palindrome. ");
	}
}