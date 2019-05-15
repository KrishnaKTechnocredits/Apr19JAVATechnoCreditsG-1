package jiniY;

import java.util.Scanner;

public class ArrayMissingNumber {

	void missingNumber(int max, int[] numberInArray) {
		for (int i = 1; i <= max; i++) {
			boolean flag = false;// flag to compare
			for (int j = 0; j < numberInArray.length; j++) {
				if (i == numberInArray[j]) {
					flag = true;
					break;
				}

			}
			if (flag == false) {
				System.out.println("Missing number is:" + i);
				// break; // if you want exactly one number which is missing
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum length of number:");
		int maxlength = Integer.parseInt(sc.nextLine());// to store max length
														// in one line

		System.out.println("Enter number:");
		String number = sc.nextLine();// to store number and get in one line

		String[] numberSplit = number.split(" ");// split numbers by space

		int[] storeNum = new int[numberSplit.length];

		for (int i = 0; i < numberSplit.length; i++)// store splitted num
													// through for loop
		{

			storeNum[i] = Integer.parseInt(numberSplit[i]);

		}

		ArrayMissingNumber arrayMissingNumber = new ArrayMissingNumber();
		arrayMissingNumber.missingNumber(maxlength, storeNum);// send max length
																// and array in
																// which splited
																// number is
																// stored

	}

}
