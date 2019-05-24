package swapanaW;

import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {

		System.out.println("Please enter the first array values : ");
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[3];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Please enter the second array values : ");
		int[] number = new int[3];

		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		FirstIndex firstIndex = new FirstIndex();
		firstIndex.comparearrays(array1, number);
	}

	void comparearrays(int[] array1, int[] number) {

		int i = 0;
		int j = 0;
		while (i < array1.length) {
			while (j < number.length) {
				if (array1[i] != number[j]) {
					System.out.println("Values are not matching at index -> " + j);
					break;
				}
				j++;
				i++;
			}
			break;
		}
	}
}