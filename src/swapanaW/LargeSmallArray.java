package swapanaW;

import java.util.Scanner;

/* Number to be matched with sum of two array elements  */

public class LargeSmallArray {

	public static void main(String[] args) {
		System.out.println("Please enter the values of array: ");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the sum to compare with array values :");
		int sum = sc.nextInt();

		sumArray(array, sum);
	}

	static void sumArray(int[] array, int sum) {

		for (int j = 0; j < array.length; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] + array[k] == sum) {
					System.out.println("The sum of {" + array[j] + "," + array[k] + "} is : " + sum);
					break;
				}
			}
		}
	}
}