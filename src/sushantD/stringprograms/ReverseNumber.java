package sushantD.stringprograms;

import java.util.Scanner;

/*
 * reverse of a number
 */
public class ReverseNumber {

	public static void main(String[] args) {
		reverseNumber();

	}

	static void reverseNumber() {
		System.out.println("please  enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int remainder = 0;
		int reversenumb = 0;
		while (number != 0) {

			remainder = number % 10;
			reversenumb = reversenumb * 10 + remainder;
			number = number / 10;

		}
		System.out.println("Reverse of the  number is" + " " + reversenumb);

	}

}
