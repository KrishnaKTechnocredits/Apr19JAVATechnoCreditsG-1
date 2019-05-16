package mainyS;
/*WAP to print following
1 
1 2
1 2 3
1 2
1*/

public class PatternQ5 
{
	static void m1(){
		//divide the output in first 3 row
		for(int i =1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i=2;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		m1();
	}
}
