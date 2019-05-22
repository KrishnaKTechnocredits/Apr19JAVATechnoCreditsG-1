package swapanaW;

import java.util.Scanner;

/* Check the duplicate number in the array */

public class DuplicateNo {

	public static void main(String[] args) {

		System.out.println("Please enter the array values : ");
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		duplicateNo(number);
	}

	static void duplicateNo(int num[]) {
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Duplicate no is: " + num[i]);
			}
		}
	}
}