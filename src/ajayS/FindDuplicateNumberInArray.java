package ajayS;

import java.util.Scanner;

public class FindDuplicateNumberInArray {
	void findDuplicateNumber(int[] numbers) {// method to find duplicate number
												// in a given array of numbers
		for (int i = 0; i < numbers.length; i++) {// outer loop to pass number
													// in array
			int count = 0;
			for (int j = i + 1; j < numbers.length; j++) {// inner loop to match
															// number with other
															// numbers in array
				if (numbers[i] == numbers[j]) {
					count++;
					break;
				}
			}
			if (count > 0)
				System.out.println("duplicate number is: " + numbers[i]);
			
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the numbers ");
		String input = scanner.nextLine();
		String[] data = input.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}
		FindDuplicateNumberInArray duplicate = new FindDuplicateNumberInArray();
		duplicate.findDuplicateNumber(numbers);
		scanner.close();

	}
}
