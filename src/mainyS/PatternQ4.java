package mainyS;
/*WAP to print following
1 * 3 *
* 2 * 4
1 * 3 *
* 2 * 4 */

public class PatternQ4 
{
	static void m1()
	{
		for(int i =1;i<=4;i++)
		{
			for(int j =1;j<=4;j++)
			{
				int z=i+j;
				if(z%2==0)
				{
					System.out.print(j + " ");
				}
				else
				{
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		m1();
	}
}
