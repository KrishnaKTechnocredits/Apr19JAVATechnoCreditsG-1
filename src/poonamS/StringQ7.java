package poonamS;

public class StringQ7 {

	// WAP to print sum of all the digits in the given number.
	// e.g., i/p = 12345 ; o/p = 15

	void findSumOfDigits(int n) {
		int temp, m, sum = 0;
		while (n > 0) {
			temp = n % 10;
			m = n / 10;
			sum = sum + temp;
			n = m;
		}
		System.out.println("Sum of all the digits is " + sum);
	}

	public static void main(String[] args) {
		int number = 123456;
		StringQ7 q7 = new StringQ7();
		q7.findSumOfDigits(number);
	}

}
