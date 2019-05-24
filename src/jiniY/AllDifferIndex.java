package jiniY;

import java.util.Scanner;

public class AllDifferIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max size of your array:");
		int max = sc.nextInt();// to get max size for array

		System.out.println("Enter user input for first array:");
		int[] arr1 = new int[max];// store values till max size

		for (int i = 0; i < max; i++) {// store using for loop
			arr1[i] = sc.nextInt();// in array get each value from each line
		}

		System.out.println("Enter user input for second array:");
		int[] arr2 = new int[max];// store values for second array till max

		for (int i = 0; i < max; i++) {// store using for loop
			arr2[i] = sc.nextInt();// in array get each value from each line

		}

		AllDifferIndex firstDifferIndex = new AllDifferIndex();
		firstDifferIndex.firstDifferIndex(arr2, arr1, max);

	}

	void firstDifferIndex(int array1[], int[] array2, int max) {
		for (int i = 0; i < max; i++) {

			if (array1[i] != array2[i]) {// check differ value in all index
				System.out.println("Differ index at " + i);

			}

		}
	}
}
