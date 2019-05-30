package swapanaW;

import java.util.Scanner;

public class AreaOverloading {

	public static void main(String[] args) {
		new AreaOverloading().area(2, 5);
		new AreaOverloading().area(2);
		new AreaOverloading().area(2.5);
	}

	void area(int length, int breadth) {
		System.out.println("Area of Rectangle = " + length * breadth);
	}

	void area(int side) {
		System.out.println("Area of Square = " + side * side);
	}

	void area(double radius) {
		System.out.println("Area of Circle = " + 3.14 * radius * radius);
	}
}