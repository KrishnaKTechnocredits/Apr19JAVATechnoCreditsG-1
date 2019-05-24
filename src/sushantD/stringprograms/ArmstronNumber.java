package sushantD.stringprograms;

import java.util.Scanner;

/*
* program for Armstrong Number
*/

public class ArmstronNumber {
	public static void main(String[] args) {
		ArmstrongNumber();

	}

	static void ArmstrongNumber() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;

		int sum = 0;
		while (number > 0) {
			int remainder = number % 10; // logic for number seperation
			number = number / 10; // logic for number reduction or traverse
			sum = sum + (remainder * remainder * remainder);
		}

		if (temp == sum)
			System.out.println("number is an armstrong");
		else
			System.out.println("number is not an armstrong");

	}

}