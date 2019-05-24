package poonamS;

public class ArrayQ9 {

//	9) Find all differ index from given arrays
//	i/p :- arr1: {10,2,9,14,3}
//	arr2: {10,2,18,14,13}
//	o/p :- Values are not matching at index -> 2
//	Values are not matching at index -> 4
	
	
	void findAllDiffIndex(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				System.out.println("Values are not matching at index -> " + i);
	}

	public static void main(String[] args) {

		int[] ar1 = { 10, 3, 9, 13, 3 };
		int[] ar2 = { 10, 3, 8, 14, 4 };

		ArrayQ9 q9 = new ArrayQ9();
		q9.findAllDiffIndex(ar1, ar2);
	}
}

	
	

