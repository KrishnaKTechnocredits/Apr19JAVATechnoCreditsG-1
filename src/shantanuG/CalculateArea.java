package shantanuG;

import java.util.Scanner;

public class CalculateArea {
	void areaOfRectangle(double length,double breadth)
	{
		System.out.println("Area of rectangle is: "+(length*breadth));
	}
	void areaOfTriangle(double base,double height)
	{
		System.out.println("Area of triangle is: "+(0.5*base*height));
	}
	void areaOfCircle(double radius)
	{
		System.out.println("Area of radius is: "+(3.14*radius*radius));
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		CalculateArea calculateArea=new CalculateArea();
		int ch=1;
		while(ch==1)
		{
			System.out.println("OPERATIONS");
			System.out.println("1. Area of Rectangle");
			System.out.println("2. Area of Triangle");
			System.out.println("3. Area of Circle");
			System.out.println("Enter the serial number of operation which you want to perform:");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:
					System.out.println("Enter length of the rectangle");
					double length=sc.nextDouble();
					System.out.println("Enter breadth of the rectangle");
					double breadth=sc.nextDouble();
					calculateArea.areaOfRectangle(length,breadth);
					break;
					
				case 2:
					System.out.println("Enter base of the triangle");
					double base=sc.nextDouble();
					System.out.println("Enter height of the triangle");
					double height=sc.nextDouble();
					calculateArea.areaOfTriangle(base,height);
					break;
				
				case 3:
					System.out.println("Enter radius of the circle");
					double radius=sc.nextDouble();
					calculateArea.areaOfCircle(radius);
					break;
				
				default:
					System.out.println("Enter valid option");
					break;
			}
			System.out.println("Do you want to continue (1 for YES/0 for NO)?");
			ch=sc.nextInt();
			if(ch!=1)
				System.exit(0);
		}
	}

}
