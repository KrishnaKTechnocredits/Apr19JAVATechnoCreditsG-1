package jiniY;

import java.util.Scanner;

public class Circle {

	void areaOfCircle(float radius) {//method body for area
		double area = 0;
		area = 3.14 * radius * radius;//radius called through child class
		System.out.println("Area of Circle is :" + area);

	}

	void circumOfCircle(float radius) {//method body for circumference
		double circum = 0;
		circum = 2 * 3.14 * radius;//radius called through child class
		System.out.println("Circumference of Circle is :" + circum);
	}
}
