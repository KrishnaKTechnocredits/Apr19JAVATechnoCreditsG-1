package shantanuG;

public class Program9 {
	void swap(int x,int y)
	{
		System.out.println("Before swap");
		System.out.println("Value of x is "+x+" and value of y is "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap");
		System.out.println("Value of x is "+x+" and value of y is "+y);		
	}
	public static void main(String args[])
	{
		Program9 program9=new Program9();
		program9.swap(5, 9);
	}
}
