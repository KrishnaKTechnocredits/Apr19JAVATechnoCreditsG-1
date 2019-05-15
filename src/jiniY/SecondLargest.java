package jiniY;

import java.util.Scanner;

public class SecondLargest {

	void secondLargestNumber(int maxi, int[] num) {
		int max = 0;// consider max =0
		int second_largest = 0;// consider second largest =0
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {// check zero index till max
				second_largest = max;// if zero index greater than max ,store
										// max value as second largest
				max = num[i];// and index of array containing value as max value

			} else if (num[i] > second_largest) {// if statement false then go
													// in this condition and
													// check if array of that
													// index having that value
													// is greater than second
													// largest
				second_largest = num[i];// if yes then index of array containing
										// value as second largest value

			}
		}

		System.out.println("\nSecond largest number is:" + second_largest);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max length for your array");
		int maxLength = Integer.parseInt(sc.nextLine());// store max length for
														// array

		System.out.println("Enter number");
		String num = sc.nextLine();// store number for array from one line only

		String[] splitNum = num.split(" ");// split number by space
		int[] storeSplitNum = new int[splitNum.length];// create array

		for (int i = 0; i < splitNum.length; i++) {// store value in array using
													// for loop
			storeSplitNum[i] = Integer.parseInt(splitNum[i]);
		}

		SecondLargest secondLargest = new SecondLargest();
		secondLargest.secondLargestNumber(maxLength, storeSplitNum);

	}

}
