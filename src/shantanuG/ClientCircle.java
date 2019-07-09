package shantanuG;

import java.util.Scanner;

public class ClientCircle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		float radius=sc.nextFloat();
		
		Circle circle=new Circle();
		circle.getRadius(radius);
		circle.calculateArea();
		circle.calculateCircumference();
	}

}
