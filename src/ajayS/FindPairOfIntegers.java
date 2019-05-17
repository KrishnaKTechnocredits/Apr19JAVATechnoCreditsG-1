package ajayS;

import java.util.Scanner;

public class FindPairOfIntegers {
	void findPair(int[] array, int number) {// method to add all the elements of array with each other one by one and match sum with given number
		int count = 0;
		System.out.println("number whos's sume is equal to " + number);
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == number) {
					System.out.println(" are " + array[i] + ", " + array[j]);
					count++;
				}

			}
		}
		if (count == 0)
			System.out.println("no pair ");

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the array");
		String input = scanner.nextLine();
		System.out.println("pease enter the number");
		int number = scanner.nextInt();
		String[] data = input.split(" ");
		int[] array = new int[data.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(data[i]);
		}
		FindPairOfIntegers findPairOfIntegers = new FindPairOfIntegers();
		findPairOfIntegers.findPair(array, number);
	}

}
