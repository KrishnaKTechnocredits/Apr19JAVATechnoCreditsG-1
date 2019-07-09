package poonamS;

import java.util.Scanner;

public class ArrayQ2 {

	// 2) Find duplicate number on Integer array in Java?
	// Hint: There is exactly one number is repeated in the array. You need to
	// write a program to
	// find that duplicate number. For example, if an array with length 6
	// contains numbers {0, 3,
	// 1, 2, 3}, then duplicated number is 3.

	void findDuplicateNumber(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] == numArr[j]) {
					flag = true;
				}
			}
			if (flag == true)
				System.out.println("Duplicate Number is " + numArr[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Numbers");
		String allNum = sc.nextLine();
		String[] row = allNum.split(",");

		int[] numA = new int[row.length];

		for (int i = 0; i < row.length; i++) {
			numA[i] = Integer.parseInt(row[i]);
		}
		ArrayQ2 q2 = new ArrayQ2();
		q2.findDuplicateNumber(numA);

	}

}
