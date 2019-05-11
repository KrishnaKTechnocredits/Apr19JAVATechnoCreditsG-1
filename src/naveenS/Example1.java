package naveenS;

public class Example1 {

	int x;
	int y;
	int sum;
	int diff;
	int mul;
	int div;
	int rem;

	int summoftwono(int x, int y) {
		sum = x + y;
		System.out.println("Sum of two no is :-" + sum);
		return sum;
	}

	int diffoftwono(int x, int y) {
		diff = x - y;
		System.out.println("Diff of two no is :-" + diff);
		return diff;
	}

	int multwono(int x, int y) {
		mul = x * y;
		System.out.println("Multiple of two no is :- " + mul);
		return mul;
	}

	int divideoftwono(int x, int y) {
		div = x % y;

		System.out.println("Division of two no is :- " + div);
		return div;
	}

	void remoftwono(int x, int y) {

		rem = x / y;
		System.out.println("Remainder of two no is :- " + rem);
		// return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1 ex1 = new Example1();
		ex1.summoftwono(10, 20);
		ex1.diffoftwono(50, 20);
		ex1.multwono(20, 30);
		ex1.divideoftwono(100, 30);
		ex1.remoftwono(4, 2);
	}

}
