package jiniY;

import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for side");
		int side = sc.nextInt();
		Square sq = new Square(side);// constructor calling while object
										// creation

		sq.area();// method calling
	}
}
