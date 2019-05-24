package poonamS;

public class ArrayQ4 {

	// 4) Largest and smallest number in unsorted array?
	// Hint: For example, if input integer array is {2, 6, 3, 9, 11} and given
	// sum is 9, output
	// should be {6,3}.

	void findLargestNum(int ar[]) {
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max)
				max = ar[i];

		}
		System.out.println("Largest number is " + max);

	}

	void findSmallestNum(int ar[]) {
		int min = 0;
		min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min)
				min = ar[i];

		}
		System.out.println("Smallest number is " + min);

	}

	public static void main(String[] args) {

		int[] a = { 20, 6, 9, 3, 15 };

		ArrayQ4 q4 = new ArrayQ4();
		q4.findLargestNum(a);
		q4.findSmallestNum(a);
	}

}
