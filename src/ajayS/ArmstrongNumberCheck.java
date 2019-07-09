package ajayS;

import java.util.Scanner;

public class ArmstrongNumberCheck {
	void armstrongNumber(int number) {// method to find Number is Armstrong or
										// Not
		int baseNumber = number;
		int newNumber = 0;
		while (number > 0) {
			int digit = number % 10;
			number = number / 10;
			newNumber = newNumber + digit * digit * digit;
		}
		if (newNumber == baseNumber) {
			System.out.println("Number is armstrong number");
		} else
			System.out.println("Number is not armstrong number");

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number ");
		int number = scanner.nextInt();
		ArmstrongNumberCheck ArmstrongNumberCheck = new ArmstrongNumberCheck();
		ArmstrongNumberCheck.armstrongNumber(number);
	}
}
