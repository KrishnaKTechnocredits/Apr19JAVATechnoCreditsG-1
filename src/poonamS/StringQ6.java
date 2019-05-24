package poonamS;

public class StringQ6 {

	// WAP to print the factorial of any given number.

	void printFactorial(int number) {
		int count = 1;
		for (int i = 1; i <= number; i++) {
			count = count * i;
		}
		System.out.println("Factorial of " + number + " is " + count);
	}

	public static void main(String[] args) {

		int num = 6;
		StringQ6 q6 = new StringQ6();
		q6.printFactorial(num);

	}
}
