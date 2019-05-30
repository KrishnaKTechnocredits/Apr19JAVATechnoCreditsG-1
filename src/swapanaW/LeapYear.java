package swapanaW;

import java.util.Scanner;

//Write a Java program that takes a year from user and print whether that year is a leap year or not

public class LeapYear {

	public static void main(String[] args) {

		int year = 0;
		System.out.println("Enter the year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if (year % 4 == 0) { // leap year occurs in every 4 years
			System.out.println("This year is leap year : " + year);
		} else {
			System.out.println("Year is not leap year.");
		}
	}
}