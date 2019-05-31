package jiniY;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers to compare which one is largest among all:");
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();

		new FindLargestNumber().largestNumber(num1, num2, num3);
	}

	static void largestNumber(int num1, int num2, int num3) {
		if ((num1 > num2) && (num1 > num3))// condition if first number is
											// largest
		{
			System.out.println(num1 + " " + "is largest");
		} else if ((num2 > num1) && (num2 > num3))// condition if second number
													// is largest
		{
			System.out.println(num2 + " " + "is largest");
		} else// condition if third number is largest
		{
			System.out.println(num3 + " " + "is largest");
		}
	}

}
