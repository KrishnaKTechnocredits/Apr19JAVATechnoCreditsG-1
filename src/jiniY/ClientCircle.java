package jiniY;

import java.util.Scanner;

public class ClientCircle extends Circle {//child extended to parent
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for radius");
		float radius = sc.nextFloat();//enter value for radius

		ClientCircle circle = new ClientCircle();
		circle.areaOfCircle(radius);//send input value while calling method
		circle.circumOfCircle(radius);//send input value while calling method
	}
}
