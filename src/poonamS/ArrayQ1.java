package poonamS;

public class ArrayQ1 {

	// 1) Find the missing number in integer array of 1 to 10?
	// Hint: You have given an integer array which contains numbers from 1 to 10
	// but one
	// number is missing, you need to write a Java program to find that missing
	// number in an
	// array

	public static void main(String[] args) {
		int[] num = { 1, 2, 0, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < num.length; j++) {
				if (num[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println("Missing number is " + i);

		}

	}
}
