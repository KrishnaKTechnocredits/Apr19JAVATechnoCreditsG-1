package mainyS;

import java.util.Scanner;

//WAP to find the missing number in a given array range
public class ArrayQ1 {
	static void missingNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		String m = sc.nextLine();
		String[] arr = m.split(" ");
		System.out.println("Enter Max Number");
		int maxNumber = sc.nextInt();
		for (int i = 1; i <= maxNumber; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == Integer.parseInt(arr[j])) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Missing number is : " + i);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		missingNo();
	}
}
