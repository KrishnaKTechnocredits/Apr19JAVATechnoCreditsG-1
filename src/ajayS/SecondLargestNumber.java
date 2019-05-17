package ajayS;

import java.util.Scanner;

public class SecondLargestNumber {
	void secLargestNumber(int[] numbers) {// method to find second largest
											// number in array by comparing
											// numbers in array with each other
		int largest = numbers[0];
		int secLargest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				secLargest = largest;
				largest = numbers[i];

			} else if (secLargest < numbers[i] && numbers[i] != largest) {
				secLargest = numbers[i];
			}

		}
		if (secLargest != largest)// to handle if there are no second largest number in array
			System.out.println(" second largest number is : " + secLargest);
		else {
			System.out.println("there is no second largest number");
		}
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
		SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
		secondLargestNumber.secLargestNumber(numbers);
	}
}
