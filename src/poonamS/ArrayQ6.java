package poonamS;

public class ArrayQ6 {

	// 6)Write a java program to check the equality of two arrays?
	// Hint: Input Arrays : First Array : [21, 57, 11, 37, 24] Second Array :
	// [21, 57, 11, 37, 24] Two Arrays Are Equal

	void checkEqualityOfArrays(int ar1[], int ar2[]) {
		boolean flag = false;
		if (ar1.length != ar2.length)
			System.out.println("Two given arrays are not equal");
		else {
			for (int i = 0; i < ar1.length; i++) {
				if (ar1[i] != ar2[i])
					flag = true;
			}
			if (flag == true)
				System.out.println("Two given arrays are not equal");
			else
				System.out.println("Two given arrays are equal");
		}

	}

	public static void main(String[] args) {

		int ar1[] = { 2, 4, 7, 9 };
		int ar2[] = { 2, 4, 7, 8 };

		ArrayQ6 q6 = new ArrayQ6();
		q6.checkEqualityOfArrays(ar1, ar2);

	}
}
