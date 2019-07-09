package ajayS;

import java.util.Scanner;

public class FactorialOfNumber {
	int findctorialnumber(int number) {// method to print factorial of a number
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
			// System.out.print(factorial+" ");
		}
		return (factorial);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number ");
		int number = scanner.nextInt();
		FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
		System.out.println("factorial of " + number + " is " + factorialOfNumber.findctorialnumber(number));
	}

}
