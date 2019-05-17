package ajayS;

import java.util.Scanner;

public class DifferAtMultipleindex {
	void differedAt(int[] array1, int[] array2) {// method to match all the
		// elements of two arrays
		// and find out at what
		// index they differ
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				count++;
				System.out.println("values are not matching at index " + i);
			}
		}
		if (count == 0)
			System.out.println("all vlaues are matching");
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
		DifferAtMultipleindex differAtMultipleindex = new DifferAtMultipleindex();
		differAtMultipleindex.differedAt(array1, array2);
		scanner.close();
	}

}
