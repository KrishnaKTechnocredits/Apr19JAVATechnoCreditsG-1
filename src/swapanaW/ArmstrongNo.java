package swapanaW;

import java.util.Scanner;

/* check if a number is Armstrong or not */

public class ArmstrongNo {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();

		int result = 0;
		int output = 0;
		int temp = inputnum;

		while (temp > 0) {
			result = temp % 10;
			temp = temp / 10;
			output = output + (result * result * result);
		}
		if (inputnum == output) {
			System.out.println("The number is armstrong: " + inputnum);
		} else {
			System.out.println("The number is not armstrong: " + inputnum);
		}
	}
}