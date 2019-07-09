package shantanuG;

import java.util.Scanner;

public class WeekDay {
	void generateDay(int day)
	{
		switch(day)
		{
			case 1:
					System.out.println("It's Monday!");
					break;
			
			case 2:
					System.out.println("It's Tuesday!");
					break;
			
			case 3:
					System.out.println("It's Wednesday!");
					break;
			
			case 4:
					System.out.println("It's Thursday!");
					break;
				
			case 5:
					System.out.println("It's Friday!");
					break;
				
			case 6:
					System.out.println("It's Saturday!");
					break;
				
			case 7:
					System.out.println("It's Sunday!");
					break;
					
			default:
					System.out.println("Please enter valid day");
					break;
			
			
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any day of a week");
		int day=sc.nextInt();
		
		WeekDay weekDay=new WeekDay();
		weekDay.generateDay(day);
	}

}
