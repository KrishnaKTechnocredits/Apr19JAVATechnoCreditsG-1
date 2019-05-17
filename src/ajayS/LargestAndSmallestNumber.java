package ajayS;

import java.util.Scanner;

public class LargestAndSmallestNumber {
	void largestNumber(int[] numbers) {// method to find largest number in array
										// by comparing numbers in array with
										// each other
		int largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}

		}
		System.out.println("largest number is : " + largest);
	}

	void smallestNumber(int[] numbers) {// method to find smallest number in
										// array by comparing numbers in array
										// with each other
		int smallest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println("smallest number  is : " + smallest);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the numbers");
		String input = scanner.nextLine();
		String[] data = input.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}
		LargestAndSmallestNumber largestAndSmallestNumber = new LargestAndSmallestNumber();
		largestAndSmallestNumber.largestNumber(numbers);
		largestAndSmallestNumber.smallestNumber(numbers);
	}
}
