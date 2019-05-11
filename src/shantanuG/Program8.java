package shantanuG;

public class Program8 {

	void swap(int x, int y)
	{
		System.out.println("Before swap");
		System.out.println("Value of x is "+x+" and value of y is "+y);
		int z=x;
		x=y;
		y=z;
		System.out.println("After swap");
		System.out.println("Value of x is "+x+" and value of y is "+y);
	}
	public static void main(String args[])
	{
		Program8 program8=new Program8();
		program8.swap(6, 3);
	}
}
