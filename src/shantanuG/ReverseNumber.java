
package shantanuG;

import java.util.Scanner;

public class ReverseNumber {

	void findReverseNumber(int n)
	{
		while(n!=0)
		{
			System.out.print(n%10);
			n=n/10;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		ReverseNumber reverseNumber=new ReverseNumber();
		reverseNumber.findReverseNumber(num);
	}
}
