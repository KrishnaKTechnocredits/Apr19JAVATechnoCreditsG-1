package jiniY;

import java.util.Scanner;

public class DifferIndexMaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max size of your array:");
		int max = sc.nextInt();// get max size for array

		System.out.println("Enter user input for first array:");
		int[] arr1 = new int[max];// get value for first array

		for (int i = 0; i < max; i++) {// store value for first array
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter user input for second array:");
		int[] arr2 = new int[max];// get value for second array

		for (int i = 0; i < max; i++) {// store value for first array
			arr2[i] = sc.nextInt();
		}

		DifferIndexMaxValue firstDifferIndex = new DifferIndexMaxValue();
		firstDifferIndex.firstDifferIndex(arr2, arr1, max);

	}

	void firstDifferIndex(int array1[], int[] array2, int max) {
		for (int i = 0; i < max; i++) {

			if (array1[i] != array2[i]) {// if differ index is found
				System.out.println("Differ index at " + i);
				// check which of the index having greater value
				if (array1[i] > array2[i]) {
					System.out.println("Max Value is:" + array1[i]);
				} else {
					System.out.println("Max Value is:" + array2[i]);
				}

			}

		}
	}
}
