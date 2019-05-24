package swapanaW;

import java.util.Scanner;

/* To find the second largest element in an array of integers */

public class SecondLargeValue {

	void secondLarge(int[] a) {

		int large = 0;
		int secondlarge = 0;

		for (int i = 0; i < a.length; i++) {
			if (large < a[i]) {
				secondlarge = large;
				large = a[i];

			} else if (secondlarge < a[i] && a[i] != large) {
				secondlarge = a[i];
			}
		}
		if (secondlarge != large)
			System.out.println("The second large number is : " + secondlarge);
	}

	public static void main(String[] args) {
		System.out.println("Please enter the array values : ");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		SecondLargeValue secondLargeValue = new SecondLargeValue();
		secondLargeValue.secondLarge(array);
	}
}