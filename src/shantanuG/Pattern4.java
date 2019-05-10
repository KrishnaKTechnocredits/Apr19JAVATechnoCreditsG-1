package shantanuG;

public class Pattern4 {
	void pattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i%2!=0)
				{
					if(j%2!=0)
						System.out.print(" "+j+" ");
					else
						System.out.print(" * ");
				}
				else
				{
					if(j%2==0)
						System.out.print(" "+j+" ");
					else
						System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Pattern4 pattern4=new Pattern4();
		pattern4.pattern();
	}

}
