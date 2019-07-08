package mainyS;

import java.util.Scanner;

//WAP to find factorial of a number
public class StringQuestion6 {
	static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number to find factorial");
		int input = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= input; i++) {
			sum = sum * i;
		}
		System.out.println("Factorial of number " + input + " is " + sum);

	}

	public static void main(String[] args) {
		factorial();
	}
}
