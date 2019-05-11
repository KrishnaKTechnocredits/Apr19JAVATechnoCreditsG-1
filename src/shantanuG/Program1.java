package shantanuG;

public class Program1 {
	void addition(int num1, int num2)
	{
		System.out.println("Addition of "+num1+" and "+num2+" is:"+(num1+num2));
	}
	void subtraction(int num1, int num2)
	{
		System.out.println("Subtraction of "+num1+" and "+num2+" is:"+(num1-num2));
	}
	void multiplication(int num1, int num2)
	{
		System.out.println("Multiplication of "+num1+" and "+num2+" is:"+num1*num2);
	}
	void division(int num1, int num2)
	{
		System.out.println("Division of "+num1+" and "+num2+" is:"+num1/num2);
	}
	void remainder(int num1, int num2)
	{
		System.out.println("Remainder of division of "+num1+" and "+num2+" is:"+num1%num2);
	}
	public static void main(String args[])
	{
		Program1 program1=new Program1();
		program1.addition(12,6);
		program1.subtraction(12,6);
		program1.multiplication(12,6);
		program1.division(12,6);
		program1.remainder(12,6);	
	}
}
