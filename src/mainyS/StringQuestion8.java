package mainyS;

import java.util.Scanner;

//WAp to separate the digits and characters from user defined string
public class StringQuestion8 {
	void separte() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string that contains digits and characters");
		String[] str = sc.nextLine().split("");
		String digit = "";
		String letter = "";
		for (int i = 0; i < str.length; i++) {
			if (Character.isLetter(str[i].charAt(0))) {
				letter = letter + str[i].charAt(0);
			} else {
				digit = digit + str[i].charAt(0);
			}
		}
		System.out.println("Digits :" + digit + "\n" + "Character : " + letter);
	}

	public static void main(String[] args) {
		StringQuestion8 str8 = new StringQuestion8();
		str8.separte();
	}
}
