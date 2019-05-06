package shantanuG;

public class Program3 {
	void squareAndCube(int num)
	{
		System.out.println("Square of "+num+" is:"+num*num);
		System.out.println("Cube of "+num+" is:"+num*num*num);
	}
	public static void main(String args[])
	{
		Program3 program3=new Program3();
		program3.squareAndCube(5);
	}
}
