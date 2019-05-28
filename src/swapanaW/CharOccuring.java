package swapanaW;

import java.util.Scanner;

//character occurring in user defined String and Characters

public class CharOccuring {

	public static void main(String[] args) {
		System.out.println("Please enter the input values: ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println("Enter the character to compare with the string: ");
		String charInp = sc.next();

		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if (charInp.equalsIgnoreCase(line.charAt(i) + "")) { //Compares the user defined char with string characters.
				count++; // updating the occurrence count
			}
		}
		System.out.println("Char is : " + charInp);
		System.out.println("Number of occurence of "+charInp+ " is " + count);
	}
}
