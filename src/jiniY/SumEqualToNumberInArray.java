package jiniY;

import java.util.Scanner;

public class SumEqualToNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max length of array");
		int maxNumberArray = sc.nextInt();// get max length

		System.out.println("Enter User Input in array:");
		int[] userInput = new int[maxNumberArray];// create array store value
													// till max length

		for (int i = 0; i < maxNumberArray; i++) {// store in array
			userInput[i] = sc.nextInt();// store values one in each line
		}

		System.out.println("Enter sum value:");
		int sum = sc.nextInt();// get value for sum to check in array

		SumEqualToNumberInArray arraySumIndexCheck = new SumEqualToNumberInArray();
		arraySumIndexCheck.sumIndexArrayCheck(userInput, sum);
	}

	void sumIndexArrayCheck(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {// go till array length
			for (int j = 0; j < i; j++) {// check if index value of j greater
											// than i
				if (arr[i] + arr[j] == sum) {// if index having value equals to
												// sum value
					System.out.println(arr[i] + "," + arr[j]);// print array
																// value for
																// that index
				}
			}
		}
	}

}
