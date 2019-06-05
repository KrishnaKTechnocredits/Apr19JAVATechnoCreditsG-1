package mainyS;

import java.util.Scanner;

//WAP to check number is armstrong or not
public class StringQuestion5 {
	static void armstrong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		String str = "" + num;
		int sum = 0;
		int a;
		int b = num;
		for (int i = 0; i < str.length(); i++) {
			a = b % 10;
			sum = sum + (a * a * a);
			b = b / 10;
		}

		if (sum == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not a Armstrong");
		}
	}

	public static void main(String[] args) {
		armstrong();
	}
}
