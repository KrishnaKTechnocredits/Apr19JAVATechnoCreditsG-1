package jiniY;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();

		new LeapYear().leapYear(year);
	}

	static void leapYear(int year) {

		if (year % 4 == 0)// if year is divided by 4 and remainder is zero then
							// it is leap year
		{
			System.out.println(year + " " + "is Leap Year");
		}

		else// if year is divided by 4 and remainder is zero then it is not leap
			// year
		{
			System.out.println(year + " " + "is not Leap Year");
		}
	}
}
