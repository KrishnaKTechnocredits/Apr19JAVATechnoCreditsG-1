package shantanuG;

public class Circle {
	float radius;
	
	void getRadius(float radius)
	{
		this.radius=radius;
	}
	
	void calculateArea()
	{
		System.out.println("Area of circle is: "+3.14*radius*radius);
	}
	
	void calculateCircumference()
	{
		System.out.println("Circumference of circle is: "+2*3.14*radius);
	}
}
