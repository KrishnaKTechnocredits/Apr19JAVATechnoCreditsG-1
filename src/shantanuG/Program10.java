package shantanuG;

public class Program10 {

	int primeSum(int start, int end)
	{
		int sum=0;
		int i=0;
		int j=0;
		for(i=start;i<=end;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				sum=sum+i;
		}
		
		return sum;
	}
	public static void main(String args[])
	{
		Program10 program10=new Program10();
		System.out.println(program10.primeSum(2, 100));
	}
}
