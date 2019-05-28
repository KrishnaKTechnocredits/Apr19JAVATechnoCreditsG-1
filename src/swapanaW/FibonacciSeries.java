package swapanaW;

import java.util.Scanner;

/*Fibonacci series up to user required*/

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		fibonacci(temp);
	}

	static void fibonacci(int n) {

		if (n == 0) {
			System.out.println("0");
		} else if (n == 1) {
			System.out.println("0 1");
		} else {
			System.out.print("0 1 ");
			int fn = 0;
			int sn = 1;
			for (int i = 1; i <= n; i++) {
				int result = fn + sn;
				System.out.print(result + " ");
				fn = sn;
				sn = result;
			}
		}
	}
}