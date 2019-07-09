package poonamS;

public class ArrayQ10 {

	
//	10) Find max value at differed index
//	i/p:- arr1: {10,2,9,14,3}
//	arr2: {10,2,18,14,3}
//	o/p :- Values are not matching at index -> 2
//	From (9,18) max value is 18
	
	void findAllDiffIndex(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				{System.out.println("Values are not matching at index -> " + i);
				if (a[i]>b[i])
					System.out.println("From (" + a[i] + "," + b[i] + ") max value is " + a[i]);
				else
					System.out.println("From (" + a[i] + "," + b[i] + ") max value is " + b[i]);
				}
	}

	public static void main(String[] args) {

		int[] ar1 = { 10, 3, 9, 13, 3 };
		int[] ar2 = { 10, 3, 8, 14, 4 };

		ArrayQ10 q10 = new ArrayQ10();
		q10.findAllDiffIndex(ar1, ar2);
	}

	
	
}
