package sushantD.stringprograms;

import java.util.Scanner;

/*
 * program for reverse String
 */

public class ReverseSingleString {

	public static void main(String[] args) {

		reverString();

	}

	static void reverString() {

		System.out.println("Please enter the String you want to reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int strsize = str.length();

		String reverse = "";

		for (int i = strsize - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String is -->" + " " + reverse);

	}

}
