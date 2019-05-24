package sushantD;

import java.util.Scanner;

public class DuplicateNumber {
	public static void main(String[] args) {
		findDuplicateNumber();

	}

	static void findDuplicateNumber() {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer index = null;
		System.out.println("enter elements for array");
		int numarray[] = new int[size];
		for (int i = 0; i < size; i++) {
			numarray[i] = sc.nextInt();

		}
		// searching logic
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (numarray[i] == numarray[j]) {
					System.out.println("duplicate element is :" + numarray[i]);
					index = j;

					System.out.println("duplicate element found at index :" + index);
				}

			}

		}

	}

}
