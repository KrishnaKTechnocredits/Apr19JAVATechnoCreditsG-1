package mainyS;

import java.util.Scanner;

//WAP to reverse number
public class StringQuestion4 {
	static void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int num = sc.nextInt();
		String num1 = "" + num;

		for (int i = num1.length() - 1; i >= 0; i--) {
			System.out.print(num1.charAt(i));
		}

	}

	public static void main(String[] args) {
		reverse();
	}

}
