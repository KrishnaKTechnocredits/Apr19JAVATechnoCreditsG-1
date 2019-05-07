package swapanaW;

public class SwapThird {

	static void swapt(int a,int b)
	{
		System.out.println("Values entered as A = " +a+ " B = " +b );

		int temp = a+b;
		
		a = temp - a;
		b = temp - b;
		
		System.out.println("Values swapped as A = " +a+ " B = " +b );
	}
	
	public static void main(String[] args) {

		swapt(1234,5678);
		
	}

}
