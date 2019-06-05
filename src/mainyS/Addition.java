package mainyS;

import java.util.Scanner;

//Create Addition class and write methods for add
public class Addition {
	String str;
	static Scanner sc = new Scanner(System.in);

	void integerSum() {
		System.out.println("Input the integer 1");
		int num = sc.nextInt();
		System.out.println("Input the integer 2");
		int num1 = sc.nextInt();
		int sum = num + num1;
		System.out.println("Sum of two integers is : " + sum);
	}

	void decimalSum() {
		System.out.println("Input the decimal value 1");
		float num = sc.nextFloat();
		System.out.println("Input the decimal value 2");
		float num1 = sc.nextFloat();
		float sum = num + num1;
		System.out.println("Sum of two decimal is : " + sum);
	}

	void stringSum() {
		System.out.println("Input the string value 1");
		String num = sc.next();
		System.out.println("Input the string value 2");
		String num1 = sc.next();
		int sum = Integer.parseInt(num) + Integer.parseInt(num1);
		System.out.println("Sum of two string is : " + sum);
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		add.integerSum();
		add.decimalSum();
		add.stringSum();

	}
}
