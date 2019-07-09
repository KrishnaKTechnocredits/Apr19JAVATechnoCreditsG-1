package shantanuG;

import java.util.Scanner;

public class Calculator {

	int add(int add1,int add2)
	{
		return add1+add2;
	}
	int sub(int sub1,int sub2)
	{
		return sub1-sub2;
	}
	int mult(int mult1,int mult2)
	{
		return mult1*mult2;
	}
	float div(float div1,float div2)
	{
		return div1/div2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator calculator=new Calculator();
		int ch=1;
		while(ch==1)
		{
			System.out.println("OPERATIONS");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("Enter serial number of operation which you want to perform");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:
						System.out.println("Enter first number");
						int add1=sc.nextInt();
						System.out.println("Enter second number");
						int add2=sc.nextInt();
						System.out.println("Addition of "+add1+" and "+add2+" is:"+calculator.add(add1,add2));
						break;
				case 2:
						System.out.println("Enter first number");
						int sub1=sc.nextInt();
						System.out.println("Enter second number");
						int sub2=sc.nextInt();
						System.out.println("Subtraction of "+sub1+" and "+sub2+" is:"+calculator.sub(sub1,sub2));
						break;
						
				case 3:
						System.out.println("Enter first number");
						int mult1=sc.nextInt();
						System.out.println("Enter second number");
						int mult2=sc.nextInt();
						System.out.println("Multiplication of "+mult1+" and "+mult2+" is:"+calculator.mult(mult1,mult2));
						break;
						
				case 4:
						System.out.println("Enter first number");
						float div1=sc.nextFloat();
						System.out.println("Enter second number");
						float div2=sc.nextFloat();
						System.out.println("Division of "+div1+" and "+div2+" is:"+calculator.div(div1,div2));
						break;
				
				default:
						System.out.println("Please enter valid option");
						break;
			}
			System.out.println("Do you want to continue (1 for YES/0 for NO)?");
			ch=sc.nextInt();
			if(ch!=1)
				System.exit(0);
		}
	}
}
