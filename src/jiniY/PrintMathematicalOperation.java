package jiniY;

public class PrintMathematicalOperation {

	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Addition:" + sum);
	}

	void subtraction(int c, int d) {
		int sub = c - d;
		System.out.println("Subtraction:" + sub);
	}

	void multiply(int a, int b) {
		int mul = a * b;
		System.out.println("Multiplication:" + mul);
	}

	void division(int c, int d) {
		int div = c / d;
		System.out.println("Division:" + div);
	}

	void remainder(int a, int b) {
		int rem = a % b;
		System.out.println("Remainder:" + rem);
	}

	public static void main(String[] args) {

		PrintMathematicalOperation printMathematicalOperation = new PrintMathematicalOperation();
		printMathematicalOperation.addition(10, 20);
		printMathematicalOperation.subtraction(30, 20);
		printMathematicalOperation.division(10, 2);
		printMathematicalOperation.multiply(50, 10);
		printMathematicalOperation.remainder(9, 3);

	}

}
