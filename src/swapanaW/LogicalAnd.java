package swapanaW;

import java.util.Scanner;

// Find the largest of three numbers using Logical And operator. 

public class LogicalAnd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three nos.");
		String[] input = sc.nextLine().split(" ");

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		LogicalAnd l = new LogicalAnd();
		l.large(a, b, c);
	}

	void large(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println(a + " is greater.");
		} else if (b > a && b > c) {
			System.out.println(b + " is greater.");
		} else if (c > a && c > b) {
			System.out.println(c + " is greater.");
		}
	}
}