package siddhantK;

public class SwapUsingExtraVariable {

	public static void main(String[] args) {
		SwapUsingExtraVariable s = new SwapUsingExtraVariable();
		 	s.swapper(26,51);	
		}

		public void swapper(int a, int b)
		{   
			int c;
			System.out.println("Value of a & b before swapping "+ a +" "+b);
			c=a;
			a=b;
			b=c;
			System.out.println("Value of a & b after swapping "+ a +" "+b);
		}

	}


