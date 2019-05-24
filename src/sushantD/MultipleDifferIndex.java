package sushantD;

import java.util.Scanner;

public class MultipleDifferIndex {
	public static void main(String[] args) {
		multipleDifferIndex();

	}

	static void multipleDifferIndex() {
		System.out.println("enter the size of arrays");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		boolean flag = false;
		System.out.println("enter elements for first arrays");

		int firstarray[] = new int[size];
		int secondarray[] = new int[size];

		for (int i = 0; i < size; i++) {

			firstarray[i] = sc.nextInt();

		}
		System.out.println("enter elements for second arrays");

		for (int j = 0; j < size; j++) {

			secondarray[j] = sc.nextInt();

		}

		int temp = 0;
		for (int i = 0; i < firstarray.length; i++) {

			if (firstarray[i] != secondarray[i]) {
				temp++;
				System.out.println("elements do  not matching at index " + i);

			}

		}

		if (temp == 0)
			System.out.println("all elements are same in both arrays");

	}

}
