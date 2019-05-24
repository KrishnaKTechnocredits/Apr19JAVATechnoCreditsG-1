package sushantD;

import java.util.Arrays;
import java.util.Scanner;

public class Largestandsmallestelement {

	public static void main(String[] args) {

		findminnumber();
		// findmaxnumber();
	}

	static void findminnumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");

		int size = sc.nextInt();
		int numarray[] = new int[size];

		System.out.println("enter elements for array");
		for (int i = 0; i < size; i++) {
			numarray[i] = sc.nextInt();
		}
		int min = numarray[0];
		for (int j = 1; j < size; j++) {

			if (min > numarray[j]) {
				min = numarray[j];
			}
		}
		System.out.println("min number is :" + min);
	}

	static void findmaxnumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");

		int size = sc.nextInt();
		int numarray[] = new int[size];

		System.out.println("enter elements for array");
		for (int i = 0; i < size; i++) {
			numarray[i] = sc.nextInt();
		}
		int max = numarray[0];
		for (int j = 1; j < size; j++) {

			if (max < numarray[j]) {
				max = numarray[j];
			}
		}
		System.out.println("max number is :" + max);
	}
}
