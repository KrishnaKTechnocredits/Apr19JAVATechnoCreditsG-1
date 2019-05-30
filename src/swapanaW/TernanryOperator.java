package swapanaW;

import java.util.Scanner;

//greater of two numbers using ternary operator.

public class TernanryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos.");
		String[] input = sc.nextLine().split(" ");

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		TernanryOperator ter = new TernanryOperator();
		ter.ternary(a, b);
	}

	void ternary(int x, int y) {
		int output;
		output = (x > y) ? x : y;
		System.out.println(output + " is greater.");
	}
}