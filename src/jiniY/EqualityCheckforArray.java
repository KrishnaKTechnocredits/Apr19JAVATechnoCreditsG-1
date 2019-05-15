package jiniY;

import java.util.Scanner;

public class EqualityCheckforArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Max Number");
		int MaxNumber = Integer.parseInt(sc.nextLine());// get max value for
														// array

		System.out.println("Enter first array");
		String array1 = sc.nextLine();// enter value for first array

		String[] arr1 = array1.split(" ");// split value
		int[] num1 = new int[arr1.length];// create array

		for (int a = 0; a < arr1.length; a++) {// store in array
			num1[a] = Integer.parseInt(arr1[a]);
		}

		System.out.println("Enter second array");
		String array2 = sc.nextLine();// get values for second array

		String[] arr2 = array2.split(" ");// split values
		int[] num2 = new int[arr2.length];// create second array

		for (int b = 0; b < arr2.length; b++) {// store using for loop
			num2[b] = Integer.parseInt(arr2[b]);
		}

		boolean flag = false;// consider by default flag as false

		for (int i = 0; i < 4; i++) {

			if (num1[i] == num2[i]) {// compare both array index if same and
										// having same value
				flag = true;// flag becomes true
			}

			else {
				flag = false;// if no,flag=false
				break;
			}

		}

		if (flag == true) {// print statement for flag=true

			System.out.println(" Array is  same");
		} else {// print statement for flag=false

			System.out.println(" Array is not same");
		}
	}

}
