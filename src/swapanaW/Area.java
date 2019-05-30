package swapanaW;

import java.util.Scanner;

//Calculate area of Rectangle, area of Triangle and area of Circle using switch statement.

public class Area {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select one of the below option :");
		System.out.println("1. Area of Rectangle");
		System.out.println("2. Area of Triangle");
		System.out.println("3. Area of Circle");

		int operator = sc.nextInt();

		switch (operator) {
		case 1:
			System.out.println("Enter the length: ");
			float length = sc.nextFloat();
			System.out.println("Enter the breadth: ");
			float breadth = sc.nextFloat();
			System.out.println("Area of rectangle = " + length * breadth);
			break;
		case 2:
			System.out.println("Enter the base: ");
			float base = sc.nextFloat();
			System.out.println("Enter the height: ");
			float height = sc.nextFloat();
			System.out.println("Area of triangle = " + (0.5 * base * height));
			break;
		case 3:
			System.out.println("Enter the radius ");
			double radius = sc.nextDouble();
			System.out.println("Area of Circle = " + 3.14 * radius * radius);
			break;
		default:
			System.out.println("Invalid input.");
			break;
		}
	}
}