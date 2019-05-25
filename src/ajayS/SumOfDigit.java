package ajayS;

import java.util.Scanner;

public class SumOfDigit {
	int printSumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			number = number / 10;
			sum = sum + digit;
			
		}
		return (sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the Number");
		int number = scanner.nextInt();
		SumOfDigit sumOfDigit = new SumOfDigit();
		System.out.println("Sum of digits of " + number + " : " + sumOfDigit.printSumOfDigits(number));
	}
}
