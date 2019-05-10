package shantanuG;

public class Pattern6 {
	void pattern()
	{
		for(int j=1;j<=9;j++)	
		{
			if(j%3==0)
			{
				System.out.print(3*j+" ");
				System.out.println();
			}
			else
				System.out.print(3*j+" ");
		}
	}
	public static void main(String args[])
	{
		Pattern6 pattern6=new Pattern6();
		pattern6.pattern();
	}

}
