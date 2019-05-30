package swapanaW;

import java.util.Scanner;
/* Sum of digits */
public class SumDigit {
	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		SumDigit sDigit = new SumDigit();
		sDigit.digitSum(temp);
	}

	void digitSum(int temp) {

		int output = 0;
		int sum = 0;
		while (temp > 0) {
			if (temp != 0) {
				output = temp % 10;
				sum = sum + output;
				temp = temp / 10;
			}
		}
		System.out.println("The sum of digits is : " + sum);
	}
}
