package swapanaW;

import java.util.Scanner;

/* Equality of two arrays */

public class EqualArrays {

	public static void main(String[] args) {
		System.out.println("Please enter the array one values : ");
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[5];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Please enter the array two values : ");
		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		EqualArrays equalarrays = new EqualArrays();
		equalarrays.comparearrays(array1, number);
	}

	void comparearrays(int[] array1, int[] number) {

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (array1[i] == number[j] && array1.length == number.length)
					System.out.println("Two arrays are equal.");
				break;
			}
		}
	}
}