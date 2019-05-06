package shantanuG;

public class Program4 {
	static double pi=3.14;
	void areaAndPerimeterOfCircle(int radius)
	{
		System.out.println("Area of circle is:"+pi*radius*radius);
		System.out.println("Perimeter of circle is:"+2*pi*radius);
	}
	void areaAndPerimeterOfRectangle(int length,int width)
	{
		System.out.println("Area of rectangle is:"+length*width);
		System.out.println("Perimeter of rectangle is:"+2*(length+width));
	}
	public static void main(String args[])
	{
		Program4 program4=new Program4();
		program4.areaAndPerimeterOfCircle(3);
		program4.areaAndPerimeterOfRectangle(5, 3);
	}
}
