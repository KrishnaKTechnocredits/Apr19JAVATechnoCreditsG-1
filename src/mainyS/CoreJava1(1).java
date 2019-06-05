package CoreJava_Assignement;

import java.util.Scanner;

//WAP to find largest of 3 numbers using logical AND operator
public class CoreJava1 
{
	void largestNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		String[] str = sc.nextLine().split(" ");
		int num1 = 0;
		for(int i=0;i<str.length;i++)
		{			
			if(Integer.parseInt(str[i])>num1 && num1<=Integer.parseInt(str[i]) )
			{
				num1=Integer.parseInt(str[i]);
			}
		}
			System.out.println("Largest number is : " + num1);
	}
	
	public static void main(String[] args) {
		CoreJava1 large = new CoreJava1();
		large.largestNumber();
	}
}
