package mainyS;

//WAP to swap two numbers without using the third variable
public class Q9 {

	void swapNo(int x, int y) {
		System.out.println("x is = " + x + " and y is = " + y);
		y = (x + y) - (x = y);

		System.out.println("x is = " + x + " and y is = " + y);

	}

	public static void main(String args[]) {
		Q9 q9 = new Q9();
		q9.swapNo(500, 100);

	}
}
