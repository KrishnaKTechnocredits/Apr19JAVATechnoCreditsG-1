package mainyS;

//WAP to find the square and cube of a number
public class Q3 {

	void square(int x) {
		System.out.println("Square of " + x + " is: " + (x * x));
	}

	void cube(int x) {
		System.out.println("Cube of " + x + " is: " + (x * x * x));
	}

	public static void main(String args[]) {
		Q3 q3 = new Q3();
		q3.square(2);
		q3.cube(5);

	}

}
