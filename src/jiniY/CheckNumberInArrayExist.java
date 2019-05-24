package jiniY;

import java.util.Scanner;

public class CheckNumberInArrayExist {

	static void numberExist(int max, int[] arr, int check) {
		int count = 0;
		for (int i = 0; i < max; i++) {// go to max length

			if (check == arr[i]) {// check in array if number is in array
				count = 1;// if yes count =1

				break;
			}
		}
		if (count == 1) {// if yes print exist
			System.out.println(check + " " + "Number   exist in array.");

		} else {// if no print not exist
			System.out.println(check + " " + "Number does not exist in array.");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maximum length of number:");
		int maxLength = Integer.parseInt(sc.nextLine());// store max length

		System.out.println("Enter number to store in array");
		String num = sc.nextLine();// store value in array

		String[] split = num.split(" ");// split number

		int[] storeSplitNumber = new int[split.length];// create array

		System.out.println("Enter number to check which exist or does not exist in array");
		int checkNumber = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < split.length; i++) {// store in array using for loop
			storeSplitNumber[i] = Integer.parseInt(split[i]);
		}

		CheckNumberInArrayExist checkNumberInArrayExist = new CheckNumberInArrayExist();
		checkNumberInArrayExist.numberExist(maxLength, storeSplitNumber, checkNumber);

	}

}
