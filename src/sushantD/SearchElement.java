package sushantD;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		searchElements();

	}

	static void searchElements() {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		Integer index = null;

		int numarray[] = new int[size];
		System.out.println("Enter elements for  array");
		for (int i = 0; i < size; i++) {
			numarray[i] = sc.nextInt();
		}
		System.out.println("Enter number to be searched ");
		int number = sc.nextInt();
		boolean flag = false;

		for (int i = 0; i < size; i++) {

			if (numarray[i] == number) {
				flag = true;
				index = i;
			}

		}

		if (flag == true) {

			System.out.println("element is present at index :" + index);
		} else {
			System.out.println("element is not present in array");
		}

	}

}
