package jiniY;

import java.util.Scanner;

public class MaxAndMin {

	void max(int maxi, int[] num) {// code to get max value
		int max = num[0];// consider first value as max

		for (int i = 1; i < num.length; i++) {

			if (num[i] > max) {// check max value with first index
				max = num[i];

			}
		}
		System.out.println("Maximum in array" + max);
	}

	void min(int maxi, int[] num) {// code to get min value
		int min = num[0];// consider first value as min

		for (int i = 1; i < num.length; i++) {

			if (num[i] < min) {// check min value with first index
				min = num[i];

			}
		}
		System.out.println("Minimum in array" + min);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter max length for your array");
		int maxLength = Integer.parseInt(sc.nextLine());// store max length of
														// array

		System.out.println("Enter number");
		String num = sc.nextLine();// store number for array

		String[] splitNum = num.split(" ");// split number by space as taken in
											// one line
		int[] storeSplitNum = new int[splitNum.length];// create array to store
														// number after split

		for (int i = 0; i < splitNum.length; i++) {// store using for loop
			storeSplitNum[i] = Integer.parseInt(splitNum[i]);
		}

		MaxAndMin maxAndMin = new MaxAndMin();
		maxAndMin.max(maxLength, storeSplitNum);
		maxAndMin.min(maxLength, storeSplitNum);

	}

}
