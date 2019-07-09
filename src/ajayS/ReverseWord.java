package ajayS;

import java.util.Scanner;

public class ReverseWord {
	String reverseWord(String[] string) {// method reverse words of a given
											// string
		String reverseString = "";
		for (int i = 0; i < string.length; i++) {
			String word = "";
			for (int j = string[i].length() - 1; j >= 0; j--) {
				word = word + string[i].charAt(j);

			}
			reverseString = reverseString + word + " ";

		}
		return (reverseString);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array");
		String input = scanner.nextLine();
		String[] names = input.split(" ");
		ReverseWord reverseWord = new ReverseWord();

		String fianlReverseWord = reverseWord.reverseWord(names);
		System.out.println(fianlReverseWord);
	}
}
