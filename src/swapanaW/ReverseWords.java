package swapanaW;

import java.util.Scanner;
/* Reverse a string word by word.*/

public class ReverseWords {

	public static void main(String[] args) {

		ReverseWords revW = new ReverseWords();
		revW.wordsReverse();
	}

	void wordsReverse() {

		System.out.println("Please enter the string to reverse : ");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		String[] temp = inp.split(" "); // splittig the string by spaces
		String reverse = "";

		for (int i = 0; i < temp.length; i++) {

			String inputw = temp[i]; // Taking one word at a time
			String output = "";

			for (int j = inputw.length() - 1; j >= 0; j--) {
				output = output + inputw.charAt(j); // Storing the word in reverse
			}
			reverse = reverse + output + " "; 
		}
		System.out.print(reverse);
	}
}