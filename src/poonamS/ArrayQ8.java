package poonamS;

public class ArrayQ8 {

	// 8) Find first differ index from given arrays
	// i/p :- arr1: {10,2,9,14,3}
	// arr2: {10,2,18,14,3}
	// o/p :- Values are not matching at index -> 2

	void findFirstDiffIndex(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i]) {
				System.out.println("Values are not matching at index -> " + i);
				break;
			}
	}

	public static void main(String[] args) {

		int[] ar1 = { 10, 3, 9, 13, 3 };
		int[] ar2 = { 10, 3, 8, 14, 3 };

		ArrayQ8 q8 = new ArrayQ8();
		q8.findFirstDiffIndex(ar1, ar2);
	}
}
