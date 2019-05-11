package siddhantK;

public class RectangleCircle {

	public static void main(String[] args) 
	{

	rectangle(100,20);
	circle(120);
	}
	
	public static void rectangle(double length, double breadth)
	{
		double perimeter = 2*(length+breadth);
		double  area= length*breadth;
		System.out.println("Perimeter of Rectangle = "+perimeter);
		System.out.println("Area of Rectangle = " +area);
	}
	public static void circle(double radius)
	{
		double circum = 2*(22/7)*radius;
		System.out.println("Circumference of Circle ="+circum);
		
		double area = (22/7)*(radius*radius);
		System.out.println("Area of Circle = " +area);
		
	}

}
