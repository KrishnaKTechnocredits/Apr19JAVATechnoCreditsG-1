package shantanuG;

public class Pattern1 {
	void pattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Pattern1 pattern1=new Pattern1();
		pattern1.pattern();
	}

}
