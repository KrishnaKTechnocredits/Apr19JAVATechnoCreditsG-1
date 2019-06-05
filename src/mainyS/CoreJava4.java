package mainyS;

import java.util.Scanner;
//Calulator using swtch case
public class CoreJava4 
{
	static void cal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("sum");
		System.out.println("subtraction");
		System.out.println("multiplication");
		System.out.println("division");
		System.out.println("Please enter the operation");
		String str = sc.nextLine();
		
		switch(str)
		{
			case "sum":
			System.out.println("Please enter numbers to perform addition");
			String[] num=sc.nextLine().split(" ");
			int sum1 = 0;
			for(int i=0;i<num.length;i++)
			{
				sum1=sum1+Integer.parseInt(num[i]);
			}
			System.out.println("Sum of given number is : " + sum1);
			break;
			
			case "subtraction":
			System.out.println("Please enter numbers to perform subtraction");
			String[] num1=sc.nextLine().split(" ");
			int sub = 0;
			for(int i=0;i<num1.length;i++)
			{
				sub=Integer.parseInt(num1[i]);
				sub=sub-(Integer.parseInt(num1[i+1]));
				break;
			}
			System.out.println("Sub of given number is : " + sub);
			break;
			
			case "multiplication":
			System.out.println("Please enter numbers to perform multiplication");
			String[] num3=sc.nextLine().split(" ");
			int mul = 1;
			for(int i=0;i<num3.length;i++)
			{
				mul=mul*Integer.parseInt(num3[i]);
			}
			System.out.println("Mul of given number is : " + mul);
			break;
			
			case "division":
			System.out.println("Enter 1st number");
			int num5=sc.nextInt();
			System.out.println("Enter 2nd number");
			int num2=sc.nextInt();
			double div=num5/num2;
			System.out.println("Div of given number is : " +  div);
			break;				
		}		
	}
	
	public static void main(String[] args) {
		cal();
	}
}
