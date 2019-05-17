package ajayS;

import java.util.Scanner;

public class SearchNumberInArray {

	void searchTheNumber(int[] numbers, int theNumber) {// method to find a usr given number in group of of numbers 
		int count = 0;
		for (int i = 0; i < numbers.length; i++) { // loop to match  the number  with numbers in in array
			if (theNumber == numbers[i]) {
				count++;
				System.out.println("Number is present in array");
			}
		}
		if (count == 0) {
			System.out.println("Number is not in array");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the numbers ");
		String input = scanner.nextLine();
		System.out.println("enter the  umber to be found ");
		int theNumber = scanner.nextInt();
		String[] data = input.split(" ");
		int[] numbers = new int[data.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(data[i]);
		}
		SearchNumberInArray search = new SearchNumberInArray();
		search.searchTheNumber(numbers, theNumber);
		scanner.close();
	}

}
