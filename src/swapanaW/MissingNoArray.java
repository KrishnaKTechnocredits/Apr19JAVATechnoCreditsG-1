package swapanaW;

import java.util.Scanner;

/* Missing number from the list of 1 - 10 */

public class MissingNoArray {

	void findMissingNo(int[] array) {
		for (int i = 1; i <= 10; i++) {
			boolean temp = true;
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					temp = false;
					break;
				}
			}
			if (temp == true) {
				System.out.println("Missing number is: " + i);
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Please enter numbers from 1 to 10 : ");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		MissingNoArray missingnoarray1 = new MissingNoArray();
		missingnoarray1.findMissingNo(array);
	}
}