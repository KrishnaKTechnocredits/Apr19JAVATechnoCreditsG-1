package siddhantK;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Enter Range of values to find Prime Numbers between them
		primeNumbers(3, 103);
	}

	// To check for Prime condition
	public static void isPrime(int num)

	{
		int c = 0;
		for (int y = 2; y < num; y++) {
			if (num % y == 0) {
				c = 1;
				System.out.println(num + " Not Prime ");
				break;
			}
		}

		if (c == 0)

			System.out.println(num + " is Prime");

	}

	public static void primeNumbers(int startvalue, int endvalue) {
		int x;
		for (x = startvalue; x <= endvalue; x++) {
			isPrime(x);
		}
	}

}
