package jiniY;

import java.util.Scanner;

public class ArrayDuplicateNumber {

	static void searchDuplicate(int max, int[] num) {
		int count = 1;
		int i;
		int x = 0;
		for (i = 0; i < num.length; i++) {// check first index

			int j;
			for (j = i + 1; j < num.length; j++) {// check first index+1
				if (num[i] == num[j]) {
					count = 0;

					x = num[i];
					break;
				}
			}
		}
		if (count == 0) {// if index value is same
			System.out.println(x + " is  duplicate");
		} else {// if index value is not same
			System.out.println(" No duplicates " + " ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maximum Length of Number:");
		int maxLength = Integer.parseInt(sc.nextLine());// store max length for
														// array

		System.out.println("Enter number:");
		String number = sc.nextLine();// store number

		String[] splitNumber = number.split(" ");// split number

		int[] storeSplitNumber = new int[splitNumber.length];// create array to
																// store split
																// number

		for (int i = 0; i < splitNumber.length; i++) {// store using for loop
			storeSplitNumber[i] = Integer.parseInt(splitNumber[i]);
		}

		ArrayDuplicateNumber duplicateNumber = new ArrayDuplicateNumber();
		duplicateNumber.searchDuplicate(maxLength, storeSplitNumber);

	}

}
