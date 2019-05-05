package jiniY;

public class SquareCube {

	void squareCube(int a) {
		System.out.println("Square of Number :" + " " + (a * a));
		System.out.println("Cube of Number :" + " " + (a * a * a));
	}

	public static void main(String[] args) {
		new SquareCube().squareCube(2);
	}
}
