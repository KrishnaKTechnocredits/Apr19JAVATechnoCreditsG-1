package jiniY;

import java.util.Scanner;

class ExtractNumberAndAlpha {
	public static void main(String[] args) {
		String str;
		String numbers;
		String alpha;

		Scanner SC = new Scanner(System.in);

		System.out.print("Enter string that contains numbers and alphabets: ");
		str = SC.nextLine();

		numbers = str.replaceAll("[^0-9]", "");
		alpha = str.replaceAll("[^ a-z]","");

		System.out.println("Numbers : " + numbers + " ");
		System.out.println("Alphabets:" +alpha +" ");
	}
}