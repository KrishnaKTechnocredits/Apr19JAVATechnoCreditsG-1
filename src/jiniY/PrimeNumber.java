package jiniY;

public class PrimeNumber {

	int sum = 0;

	void primeFor(int s, int e)// using two for loop
	{
		for (int i = s; i <= e; i++) {
			int temp = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					temp = 1;
					System.out.println(i + " " + "Number is not Prime.");
					break;
				}
			}

			if (temp == 0) {

				System.out.println(i + " " + "Number is Prime.");
				sum = sum + i;
			}
		}
	}

	void displaySum() {

		System.out.println(" ");

		System.out.println("Sum of Prime Number" + " " + sum);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();

		primeNumber.primeFor(2, 10);

		primeNumber.displaySum();
	}

}
