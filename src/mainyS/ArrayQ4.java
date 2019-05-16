package mainyS;

import java.util.Scanner;

//Largest and smallest number in unsorted array
public class ArrayQ4 {
	static void min() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		String m = sc.nextLine();
		String[] arr = m.split(" ");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < Integer.parseInt(arr[i])) {
				max = Integer.parseInt(arr[i]);
			}
		}
		int min = max;
		for (int i = 0; i < arr.length; i++) {
			if (min > Integer.parseInt(arr[i])) {
				min = Integer.parseInt(arr[i]);
			}
		}
		System.out.println("Largest number is : " + max + " Smallest Number is : " + min);
		sc.close();

	}

	public static void main(String args[]) {
		min();
	}
}
