package jiniY;

import java.util.Scanner;

public class OverloadingArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length = 0;
		int breadth = 0;
		int side = 0;

		float radius = 0;
		OverloadingArea oa = new OverloadingArea();
		oa.area(side, sc);
		oa.area(length, breadth, sc);
		oa.area(radius, sc);
	}

	void area(int side, Scanner sc) {
		System.out.println("Enter side value");
		side = sc.nextInt();
		int area = side * side;
		System.out.println("Area of square is:" + " " + area);
	}

	void area(int length, int breadth, Scanner sc) {
		System.out.println("Enter length value:");
		length = sc.nextInt();
		System.out.println("Enter breadth value:");
		breadth = sc.nextInt();
		int area = length * breadth;
		System.out.println("Area of Rectangle is:" + area);
	}

	void area(float radius, Scanner sc) {
		System.out.println("Enter radius value:");
		radius = sc.nextFloat();
		double area = 3.142 * radius * radius;
		System.out.println("Area of circle is:" + " " + area);
	}
}
