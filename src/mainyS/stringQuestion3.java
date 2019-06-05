package mainyS;

import java.util.Scanner;

//Print Fibonacci Series
public class stringQuestion3 {

	static void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci series up to a number(it should be greater than 1)");
		int number = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 2; i < number; i++) {
			// System.out.print(",");
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String[] args) {
		fibonacci();

	}

}
