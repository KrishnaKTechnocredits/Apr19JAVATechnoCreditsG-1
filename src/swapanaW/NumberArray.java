package swapanaW;

import java.util.Scanner;

/* The number given from the user, to be present in the array */

public class NumberArray {

	public static void main(String[] args) {
		NumberArray numberarray = new NumberArray();
		numberarray.CompareArray();
	}
	void CompareArray() {
		System.out.println("Please enter the array values :");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the number to compare with array :");
		int num = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != num) {
				continue;
			}
			System.out.println("The number is present in array: " + num);
		}
	}
}