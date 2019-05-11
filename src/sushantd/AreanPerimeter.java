package sushantd;

import java.util.Scanner;

public class AreanPerimeter {
	public static void main(String[] args) {

		int length, breadth, area_rectangle,perimeter_rectangle;
		double radius =7.5;
		double perimeter;
		double area;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length");
		length=sc.nextInt();

		
		System.out.println("Enter the breadth");
		breadth=sc.nextInt();
		
		perimeter_rectangle = 2*(length+breadth);
		System.out.println("perimeter  of rectangle"+perimeter_rectangle);
		
		area_rectangle = (length+breadth);
		System.out.println("area  of rectangle"+area_rectangle);
		
		
		perimeter = 2* Math.PI*radius;
		System.out.println("perimeter  of circle"+perimeter);
		
		area = (Math.PI*radius*radius);
		System.out.println("area of circle"+area);
}
}
