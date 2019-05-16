package mainyS;

import java.util.Scanner;

//find max value at differed index
public class ArrayQ10 {
	static void differIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Value");
		String[] array1 = sc.nextLine().split(",");
		System.out.println("Enter Second Array Value");
		String[] array2 = sc.nextLine().split(",");

		int[] arr1 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			arr1[i] = Integer.parseInt(array1[i]);
		}

		int[] arr2 = new int[array2.length];
		for (int j = 0; j < array2.length; j++) {
			arr2[j] = Integer.parseInt(array2[j]);
		}

		if (arr1.length == arr2.length) {
			for (int m = 0; m < arr1.length; m++) {
				int count = 0;
				if (arr1[m] != arr2[m]) {
					if (arr1[m] < arr2[m]) {
						count = arr2[m];
					} else {
						count = arr1[m];

					}
					System.out.println("Values are not matching at > " + m + "\n" + "From (" + arr1[m] + "," + arr2[m]
							+ ") " + "max value is " + count);
					break;
				}
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		differIndex();
	}

}
