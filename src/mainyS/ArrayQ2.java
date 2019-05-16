package mainyS;

import java.util.Scanner;

//WAP to find the duplicate number
public class ArrayQ2 {
	static void duplicate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		String num = sc.nextLine();
		String[] arr = num.split(" ");

		for (int i = 1; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == Integer.parseInt(arr[j])) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Duplicate number is : " + arr[i]);
				break;
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		duplicate();
	}
}
