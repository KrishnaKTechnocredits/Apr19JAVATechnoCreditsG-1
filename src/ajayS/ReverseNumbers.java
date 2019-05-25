package ajayS;

import java.util.Scanner;

public class ReverseNumbers {
	String numberReversal(int number) {// method to reverse the number given by
										// user
		String reversedNumber = "";
		while (number > 0) {
			int digit = number % 10;
			number = number / 10;
			reversedNumber = reversedNumber + digit;
		}
		return (reversedNumber);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number ");
		int number = scanner.nextInt();
		ReverseNumbers reverseNumbers = new ReverseNumbers();
		System.out.println(reverseNumbers.numberReversal(number));
	}
}
