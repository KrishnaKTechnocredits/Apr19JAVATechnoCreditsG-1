package ajayS;

import java.util.Scanner;

public class FibonacciSeries {
	void printFibonacciSeries(int upto) {// method to print fibonacci series
		int x = 0;
		int y = 1;
		int z = 0;
		System.out.print(x + " " + y + " ");
		for (int i = 2; i < upto; i++) {
			z = x + y;
			x = y;
			y = z;
			System.out.print(z + " ");

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" please enter the number upto you want the Fibonacci Series to be dispalyed ");
		int number = scanner.nextInt();
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.printFibonacciSeries(number);
	}
}
