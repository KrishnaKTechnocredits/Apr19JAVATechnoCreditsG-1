package shantanuG;

public class Area {
	void calculateArea(int length, int breadth)
	{
		System.out.println("Area of rectangle is:"+length*breadth);
	}
	
	void calculateArea(int side)
	{
		System.out.println("Area of square is:"+side*side);
	}
	
	void calculateArea(float radius)
	{
		System.out.println("Area of circle is:"+3.14*radius*radius);
	}
	
	public static void main(String args[])
	{
		Area area=new Area();
		System.out.println("AREA OF RECTANGLE");
		area.calculateArea(10, 5);
		System.out.println("AREA OF SQUARE");
		area.calculateArea(5);
		System.out.println("AREA OF CIRCLE");
		area.calculateArea(5.0f);
	}

}
