package poonamS;

public class StringQ3 {

	// 3) WAP to print Fibonacci series up to user required.
	// Example:-
	// Hint :-
	// 1) Int num1 = 0, int num2 = 1
	// input :- 7
	// output: - 0 1 1 2 3 5 8

	void fibonacciSeries(int num) {
		int n1 = 0;
		int n2 = 1;
		int temp = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(temp + " ");
			temp = n2;
			n2 = n1 + n2;
			n1 = temp;
		}
	}

	public static void main(String[] args) {
		StringQ3 q3 = new StringQ3();
		int n = 10;
		q3.fibonacciSeries(n);
	}
}
