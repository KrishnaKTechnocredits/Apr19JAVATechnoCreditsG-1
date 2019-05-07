package swapanaW;

public class AreaPerimeter {

	static void rectangle(int l, int w)
	{
		int rarea = l*w;
		int rperimeter =((l*2)+(w*2));
		System.out.println("The area of rectangle is: " + rarea  +" and The Perimeter of rectangle is: " +rperimeter);
	}
	
	static void circle(int r)
	{
		double carea = (3.14*(r*r));
		double cperimeter =(3.14*(2*r));
		System.out.println("The area of circle is: " + carea +" and The Perimeter of circle is: " +cperimeter);
	}
	
	public static void main(String[] args) {

		rectangle(2, 3);
		circle(3);
	}
}