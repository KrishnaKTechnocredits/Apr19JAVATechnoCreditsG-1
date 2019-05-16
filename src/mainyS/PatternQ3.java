package mainyS;
/*WAP to print following
4 3 2 1
4 3 2
4 3 
4*/
public class PatternQ3 
{
	void pattern(){
		for(int i =1;i<=4;i++)
		{
			for(int j =4;j>=i;j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}	
		
	}
	
	public static void main(String[] args)
	{
		PatternQ3 pq3 = new PatternQ3();
		pq3.pattern();
	}

}
