package siddhantK;

public class Calculator {

	public static void main(String[] args) 
	{
	
    sum(10,20);
    subtract(90,20);
    multiply(12,13);
    divide(60,3);
    rem(13,4);
	}
	
	static void sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addition of "+a +" and "+b+"= "+sum);
	}
	
	static void subtract(int a, int b)
	{
		int sub = a-b;
		System.out.println("Subraction of "+a +" from "+b+"= "+sub);
	}
	
	static void multiply(int a, int b)
	{
		int mul = a*b;
		System.out.println("Multiplication of "+a +" and "+b+"= "+mul);
	}
	
	static void divide(int a, int b)
	{
		int div = a/b;
		System.out.println("Division of "+a +" by "+b+" = "+div);
	}
	
	static void rem(int a, int b)
	{
		int rem = a%b;
		System.out.println("Remainder on dividing "+a +" by "+b+"= "+rem);
	}

}
