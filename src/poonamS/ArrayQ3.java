package poonamS;

public class ArrayQ3 {

	// 3) Check if array contains a number in Java?
	// Hint: Your method should accept 2 parameters. Input array and number.
	// i/p :- arr[] = {2,5,9,7,4,6}
	// number :- 8
	// o/p :- number is not in arr

	void findNumberInArray(int a[], int n) {
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i])
				flag = true;
		}
		if (flag == false)
			System.out.println("Number is not in given Array");
		else
			System.out.println("Number is present in the given Array");

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7 };
		int num = 5;

		ArrayQ3 q3 = new ArrayQ3();
		q3.findNumberInArray(arr, num);
	}

}
