package poonamS;

public class Q4 {

	//WAP to find the area and perimeter of Rectangle & Circle

	
	static void rectangle(int l , int w)
	{
		System.out.println("Area of rectangle with length = " + l + " and width = " + w +" is " + (l*w));
		System.out.println("Perimeter of rectangle with length = " + l + " and width = " + w + " is " + (2*(l+w)));
	}
	
	static void circle(int r)
	{
		System.out.println("Area of circle with radius = " + r + " is " + (Math.PI*(r*r)));
		System.out.println("Perimeter of circle with radius = " + r + " is " + (2 * Math.PI* r));
	}
	
	public static void main(String[] args) {
		rectangle(15,10);
		circle(4);
	}
	
}
