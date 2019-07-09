package jiniY;

import java.util.Scanner;

public class Fibnoacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input number");
		int num = sc.nextInt();//get user input till which number series count is required

		new Fibnoacci().fibnoacci(num);

	}

	static void fibnoacci(int num) {
		int first_no = 0;//by default first no
		int second_no = 1;//by default second no

		System.out.println("Fibnoacci Series:");
		System.out.print(first_no +" ");
		System.out.print(second_no +" ");
		int temp = 0;//temp variable
		for (int i = 1; i <= num; i++) {//loop till user entered number
			System.out.print(first_no + second_no +" ");//add first number+second number
			temp = second_no;//second number value assigned to temp
			second_no = first_no + second_no;//addition of first and seconf assigned to second number variable 
			first_no = temp;//temp variable value added to first number

		}

	}

}
