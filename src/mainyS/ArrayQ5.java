package mainyS;

import java.util.Scanner;

//WAP to find the second largest number in array
public class ArrayQ5 {
	static void secondLargest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Value");
		String[] array = sc.nextLine().split(" ");

		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		int max = 0;
		int max1 = max;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max1 = max;
				max = arr[i];
			} else if (arr[i] > max1 && arr[i] != max) {
				max1 = arr[i];
			}
			sc.close();

		}

		System.out.println("Second largest element in given array is " + max1);
	}

	public static void main(String args[]) {
		secondLargest();
	}
}
