package shantanuG;

public class Pattern3 {
	void pattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(j+" ");
				//System.out.println();
			}
			System.out.println();
		}
		//System.out.println();
	}
	public static void main(String args[])
	{
		Pattern3 pattern3=new Pattern3();
		pattern3.pattern();
	}
}
