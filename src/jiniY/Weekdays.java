package jiniY;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		new Weekdays().weekdays( sc);
	}

	static void weekdays( Scanner sc) {
		System.out.println("Please enter number to check for weekdays");// ask
		// user
		// input
			int num = sc.nextInt();
		switch (num)// cases for 1 to 7
		{
		case 1:
			System.out.println("It is Monday");
			break;
		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursday");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		case 7:
			System.out.println("It is Sunday");
			break;
		default:
			System.out.println("Wrong choice");
			break;
			
		case 8: 
			System.out.println("You have exited from system");
			System.exit(0);//to exit from system
			break;
		}
		System.out.println(" ");
		new Weekdays().weekdays( sc);
	}
}
