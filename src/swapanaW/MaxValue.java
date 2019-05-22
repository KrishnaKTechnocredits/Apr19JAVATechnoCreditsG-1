package swapanaW;

import java.lang.reflect.Array;
import java.util.Scanner;

/* max value at differed index */

public class MaxValue {

	public static void main(String[] args) {

		System.out.println("Please enter the first array values : ");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Please enter the second array values : ");
		int[] number = new int[4];
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		MaxValue maxValueIndex = new MaxValue();
		maxValueIndex.maxArrays(array, number);
	}

	void maxArrays(int[] array1, int[] number) {
		int i = 0;
		int j = 0;
		while (i < array1.length) {
			while (j < number.length) {
				if (array1[i] != number[j]) {
					System.out.println("Values are not matching at index : " + j);
					if (array1[i] > number[j]) {
						System.out.println("Max value at differed index is : " + array1[i]);
					} else {
						System.out.println("Max value at differed index is : " + number[j]);
					}
					break;
				}
				j++;
				i++;
			}
			break;
		}
	}
}