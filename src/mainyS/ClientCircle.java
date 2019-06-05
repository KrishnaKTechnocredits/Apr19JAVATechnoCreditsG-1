package ClassObject;

import java.util.Scanner;

public class ClientCircle extends Circle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		float b=sc.nextFloat();
		ClientCircle c = new ClientCircle();
		c.setRadius(b);
		c.area();
		c.circumfernce();
		sc.close();
	}
}
