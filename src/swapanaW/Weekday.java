package swapanaW;

import java.util.Scanner;

/*Write a Java program that keeps a number from the user and 
* generates an integer between 1 and 7 and displays the name of the weekday. 
*(use switch case)
*/

public class Weekday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no from 1 to 7 :");
		int a = sc.nextInt();

		Weekday day = new Weekday();
		day.display(a);
	}

	void display(int x) {
		switch (x) {
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
			System.out.println("Thursay");
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
			System.out.println("Invalid input");
		}
	}
}