package swapanaW;

import java.util.Scanner;

public class AllArrayIndex {

	public static void main(String[] args) {

		System.out.println("Please enter the first array values : ");
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[6];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Please enter the second array values : ");
		int[] number = new int[6];

		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		AllArrayIndex arrayIndex = new AllArrayIndex();
		arrayIndex.indexarrays(array1, number);
	}

	void indexarrays(int[] array1, int[] number) {
		int i = 0;
		int j = 0;
		while (i < array1.length) {
		while (j < number.length) {
					if (array1[i] != number[j])
					System.out.println("Values are not matching at index -> " + j);
				j++;
				i++;
			}
		}
	}
}