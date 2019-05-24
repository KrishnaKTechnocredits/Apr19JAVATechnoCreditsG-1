package jiniY;

import java.util.Scanner;

public class FirstDifferIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max size of your array:");
		int max = sc.nextInt();// to get max size for array

		System.out.println("Enter user input for first array:");
		int[] arr1 = new int[max];// to get first array value till max size

		for (int i = 0; i < max; i++) {// store using for loop in array
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter user input for second array:");
		int[] arr2 = new int[max];// get second array value till max size

		for (int i = 0; i < max; i++) {// store using for loop in array
			arr2[i] = sc.nextInt();
		}

		FirstDifferIndex firstDifferIndex = new FirstDifferIndex();
		firstDifferIndex.firstDifferIndex(arr2, arr1, max);

	}

	void firstDifferIndex(int array1[], int[] array2, int max) {
		for (int i = 0; i < max; i++) {

			if (array1[i] != array2[i]) {// index for both array not having same
											// value
				System.out.println("Differ index at " + i);// then print index
															// value

				break;// to get first differ index using break statement

			}

		}
	}
}
