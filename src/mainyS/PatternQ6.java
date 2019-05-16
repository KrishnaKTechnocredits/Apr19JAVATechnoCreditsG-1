package mainyS;
/*WAP to print following
3 6 9
12 15 18
21 24 27*/

public class PatternQ6 
{
	static void m1() 
	{
		int count = 3;
		for(int i =1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(count + " ");
				count = count+3;
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args)
	{
		m1();
	}
}
