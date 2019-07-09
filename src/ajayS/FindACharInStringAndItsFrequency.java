package ajayS;

import java.util.Scanner;

public class FindACharInStringAndItsFrequency {
	void findACharInString(String string, String character) {// method to find a
																// character n
																// string and
																// its frequency
		int count = 0;

		for (int j = 0; j < string.length(); j++) {
			if (character.charAt(0) == string.charAt(j)) {
				count++;
			}
		}
		System.out.println("the character " + character + " is " + count + " number of times in string ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array");
		String string = scanner.nextLine();
		System.out.println("enter the character");
		String charracter = scanner.next();
		FindACharInStringAndItsFrequency findACharInStringAndItsFrequency = new FindACharInStringAndItsFrequency();
		findACharInStringAndItsFrequency.findACharInString(string, charracter);
	}
}
