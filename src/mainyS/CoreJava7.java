package CoreJava_Assignement;
import java.util.Scanner;

public class CoreJava7 
{
	static void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. rectangle");
		System.out.println("2. triangle");
		System.out.println("3. circle");
		System.out.println("Enter your choice to find area");
		String str=sc.nextLine();
		
		switch(str)
		{
		case "rectangle":
			System.out.println("Enter Length");
			int length = sc.nextInt();
			System.out.println("Enter Breath");
			int Breath = sc.nextInt();
			int area1=length*Breath;
			System.out.println("Area of rectangle is : " + area1);
			break;
		
		case "triangle":
			System.out.println("Enter base");
			int base = sc.nextInt();
			System.out.println("Enter height");
			int height = sc.nextInt();
			int area2=(height*base)/2;
			System.out.println("Area of triangle is : " + area2);
			break;
			
		case "circle":
			System.out.println("Enter radius");
			int radius = sc.nextInt();
			float area3=3.14f*(radius*radius);
			System.out.println("Area of circle is : " + area3);
			break;
			
		}

	}
	
	public static void main(String[] args) {
		area();
	}
}
