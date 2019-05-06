package First;

import java.util.Scanner;

public class Area_Pr_Rect_Circle {

	public static double AreaCircle(double x)
	{
		return 3.14*x*x;
	}
	
	public static double PeriCircle(double x)
	{
		return 2*3.14*x;
	}
	
	public static int AreaRect(int l, int w)
	{
		return l*w;
	}
	
	public static int PeriRect(int l, int w)
	{
		return 2*(l+w);
	}
	
	
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.print("Please enter number : ");
	int x=s.nextInt();
	int l=s.nextInt();
	int w=s.nextInt();
	
	System.out.println("Area of Circle is = " + AreaCircle(x));
	System.out.println("Perimeter of Circle is = " + PeriCircle(x));
	System.out.println("Area of Rectangle is = " + AreaRect(l,w));
	System.out.println("Perimeter of Rectangle is = " + PeriRect(l,w));
		
	s.close();
	}
	
	
}
