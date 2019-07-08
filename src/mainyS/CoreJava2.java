package mainyS;

import java.util.Scanner;

//WAP to find greater number using ternary operator
public class CoreJava2 {

	static void greater() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Please enter 2st number");
		int num2 = sc.nextInt();
		int num3 = num1 >= num2 ? num1 : num2;
		System.out.println("Greater Number between " + num1 + " and " + num2 + " is : " + num3);
	}

	public static void main(String[] args) {
		greater();
	}
}
