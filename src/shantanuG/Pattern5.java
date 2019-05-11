package shantanuG;

public class Pattern5 {
	void pattern()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();	
		}
		
		for(int i=2;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		Pattern5 pattern5=new Pattern5();
		pattern5.pattern();
	}

}
