package sushantD.stringprograms;

import java.util.Scanner;

/*
 * 
 * seperate digit and cahracter from string
 * 
 */
public class SeparateDigitCharacter {
	public static void main(String[] args) {
		separatedigit();
	}

	static void separatedigit() {
		System.out.println("eneter the string containg digit  and characters");
		Scanner sc = new Scanner(System.in);

		String strfirst = sc.nextLine();
		String charstring = strfirst.replaceAll("[0-9]", "");// remove number
		String numberString = strfirst.replaceAll("[^0-9]", "");// remove character

		String finalstring = charstring + numberString;
		System.out.println("final string is :" + finalstring);

	}

}
