package sushantD.stringprograms;

import java.util.Scanner;

public class ReverseEchWordString {

	public static void main(String[] args) {
		reverseEachWord();
	}

	static void reverseEachWord() {
		System.out.println("Please Enter the String");

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] words = str.split(" ");//break the string
		String reverseString = ""; 

		for (int i = 0; i < words.length; i++) {  //iterate index
			String word = words[i];
			System.out.println(word);
			String reverseword = "";

			for (int j = word.length() - 1; j >= 0; j--) {// traverse in reverse direction
				reverseword = reverseword + word.charAt(j);

			}

			reverseString = reverseString + reverseword + " ";// append each word

		}
		System.out.println(reverseString);
	}
}
