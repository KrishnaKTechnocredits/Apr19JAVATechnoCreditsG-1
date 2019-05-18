package mainyS;

import java.util.Scanner;

//Find pairs on integer array whose sum is equal to given number
public class ArrayQ7 {
	static void number() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Array : ");
		String m = sc.nextLine();
		String[] arr = m.split(" ");

		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = Integer.parseInt(arr[i]);
		}

		System.out.println("Enter sum of two numbers");
		int sum = sc.nextInt();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (sum == (arr1[i] + arr1[j])) {
					System.out.println("Integer numbers, whose sum is equal to value " + sum + "\n" + "(" + arr[i] + ","
							+ arr[j] + ")");
				}
			}
		}

		sc.close();
	}

	public static void main(String args[]) {
		number();
	}

}
