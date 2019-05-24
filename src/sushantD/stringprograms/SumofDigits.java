package sushantD.stringprograms;

import java.util.Scanner;

/*
 * Sum of digits program
 */
public class SumofDigits {

	public static void main(String[] args) {
		sumofdigit();

	}

	static void sumofdigit() {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		int numb = sc.nextInt();
		while (numb > 0) {
			n = numb % 10; // 123% 10 is 3 break the number
			sum = sum + n;
			numb = numb / 10;
		}
		System.out.println("sum of digits :" + sum);
	}

}
