package CoreJava_Assignement;

import java.util.Scanner;

public class CoreJava5 
{
	void day()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer between 1 to 7");
		int day = sc.nextInt();
		
		switch(day)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Given input is incorrect. Please enter an interger between 1 to 7");
				break;
		}
	}
	
	public static void main(String[] args) {
		CoreJava5 day1 = new CoreJava5();
		day1.day();
	}
}
