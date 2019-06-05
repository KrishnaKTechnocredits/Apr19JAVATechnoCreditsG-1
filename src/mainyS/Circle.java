package ClassObject;
public class Circle 
{
	float radius;
	void setRadius(float a)
	{
		radius=a;
	}
	
	void area()
	{
		float area =3.14f*(radius*radius);
		System.out.println("Area of circle is : " + area);
	}
	
	 void circumfernce()
	{
		float cir=2*3.14f*radius;
		System.out.println("Circumfernce of circle is : " + cir);
	}
}
