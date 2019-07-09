package jiniY;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter number for which you want to get reverse number");
		int number = sc.nextInt();//get input from user

		new ReverseNumber().reverseNumber(number);

	}

	void reverseNumber(int num) {

		int num2 = 0;//to get reverse value in this
		while (num != 0) {//num if not equal to 0

			int num1 = num % 10;//by mod get last value
			num2 = num2 * 10 + num1;//multiply number to get reverse integer
			num = num / 10;//get remaining value to of number 
		}
		System.out.println("Reverse String :" + " " + num2);//reverse string output stored and displayed
	}
}