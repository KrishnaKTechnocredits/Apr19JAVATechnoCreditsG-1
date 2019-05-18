package mainyS;
/*WAP to print following
*
# #
* * * 
# # # #*/

public class PatternQ1 
{
	static void pattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j =1;j<=i;j++)
			{
				if(i%2==1)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print("#" + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		pattern();
	}
}
