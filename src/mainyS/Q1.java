package mainyS;

// WAP for sum,subtraction,mutliplication,division and remainder of two numbers
public class Q1 {

	void sum(int a, int b) {
		System.out.println("Addition of two numbers is: " + (a + b));

	}

	void sub(int a, int b) {
		System.out.println("Subtraction of two numbers is: " + (a - b));

	}

	void mul(int a, int b) {
		System.out.println("Multiplication of two numbers is: " + (a * b));
	}

	void div(int a, int b) {
		System.out.println("Division of two numbers is: " + (a / b));
	}

	void rem(int a, int b) {

		System.out.println("Remainder of two numbers is: " + (a % b));
	}

	public static void main(String[] args) {
		Q1 q1 = new Q1();
		q1.sum(30, 10);
		q1.sub(50, 10);
		q1.mul(20, 60);
		q1.div(50, 10);
		q1.rem(350, 10);

	}
}
