package String;
import java.util.Scanner;
//WAP to verify the sum for given input
public class StringQ7 
{
	static void sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int num =sc.nextInt();
		String num1=""+num; 
		int sum =0;
		int a;
		int b=num;
		for(int i=0;i<num1.length();i++)
		{			
			a=b%10;
			sum=sum+a;
			b=b/10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		sum();
	}
}
