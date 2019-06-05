package mainyS;

import java.util.Scanner;

//WAP to create class as Area to find area of square,length etc
public class Area {
	static int side;
	static float length;
	static float width;
	static float radius;

	void area() {
		float areaSquare = side * side;
		System.out.println("Area of Square is : " + areaSquare);
	}

	void area(float length, float width) {
		float areaRectangle = length * width;
		System.out.println("Area of rectangle is : " + areaRectangle);
	}

	void area(float radius) {
		float circle = 3.14f * (radius * radius);
		System.out.println("Area of circle is :" + circle);
	}

	public static void main(String[] args) {
		Area area1 = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to find area of " + "\n" + "1. Circle" + "\n" + "2. Square" + "\n" + "3. Rectangle");
		System.out.println("Please enter the type");
		String a = sc.nextLine();

		switch (a) {
		case "Square":
			System.out.println("Please enter side of square");
			side = sc.nextInt();
			area1.area();

		case "Rectangle":
			System.out.println("Please enter length of rectangle");
			length = sc.nextInt();
			System.out.println("Please enter width of rectangle");
			width = sc.nextInt();
			area1.area(length, width);
		case "Circle":
			System.out.println("Please enter radius of circle");
			radius = sc.nextInt();
			area1.area(radius);
		}
	}
}
