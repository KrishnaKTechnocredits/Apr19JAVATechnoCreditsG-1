package swapanaW;

/* Factorial of a number */

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		FactorialNo fno = new FactorialNo();
		fno.factorial(temp);
	}

	void factorial(int number) {
		int result = 1; //to store the output value
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println("Factorial of " + number + " is: " + result);
	}
}