package ajayS;

import java.util.Scanner;

public class IdenticalArrayCheck {
	void identicalArray(int[] array1, int[] array2) {//method to match all the elements of   two arrays and find out they are identical or not 
		int count = 0;
		if (array1.length == array2.length) {// first check whether  lengths of both arrays are same or not
			for (int i = 0; i < array1.length; i++) {//if length is same then all elements of array are same or not 
				if (array1[i] != array2[i])
					System.out.println("array are not identical");
				else
					count++;
			}
			if (count == array1.length)
				System.out.println("array are  identical");
		} else//if length is not same then arrays are not identical
			System.out.println("arrays are not identical");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the first array");
		String input1 = scanner.nextLine();
		System.out.println("please enter the second array");
		String input2 = scanner.nextLine();
		String[] data1 = input1.split(" ");
		String[] data2 = input2.split(" ");
		int[] array1 = new int[data1.length];
		int[] array2 = new int[data2.length];
		for (int i = 0; i < data1.length; i++) {
			array1[i] = Integer.parseInt(data1[i]);
		}
		for (int i = 0; i < data2.length; i++) {
			array2[i] = Integer.parseInt(data2[i]);
		}
		IdenticalArrayCheck identicalArrayCheck = new IdenticalArrayCheck();
		identicalArrayCheck.identicalArray(array1, array2);
		scanner.close();
	}
}
