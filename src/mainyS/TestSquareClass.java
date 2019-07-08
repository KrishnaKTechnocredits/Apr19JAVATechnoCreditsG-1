package mainyS;

import java.util.Scanner;

//WAP to call the square class
public class TestSquareClass extends Square {

	TestSquareClass(int s) {
		super(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the side");
		int num = sc.nextInt();
		TestSquareClass sqr = new TestSquareClass(num);
		sqr.areaSquare();

	}
}
