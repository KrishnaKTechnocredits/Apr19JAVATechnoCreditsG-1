package siddhantK;

public class SwapWithoutExtraVariable {

	public static void main(String[] args) 
	{
		swapper(20,25);	
	}

	public static void swapper(int a, int b)
	{   
		System.out.println("Value of a & b before swapping "+ a +" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a & b after swapping "+ a +" "+b);
	}
	
}
