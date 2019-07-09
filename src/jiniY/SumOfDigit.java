package jiniY;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input number");
		int num = sc.nextInt();

		new SumOfDigit().sumOfDigit(num);
	}

	void sumOfDigit(int num) {
		int number = num;//store original value in some other temp variable
		int temp;
		int sum = 0;
		while (number != 0) {
			temp = number % 10;//get remainder
			sum = sum + temp;//add remainder
			number = number / 10;//get quotient to get next value to remove remainder
		}
		System.out.println("Sum of digit:" + num + " " + "is" + " " + sum);//result

	}
}
