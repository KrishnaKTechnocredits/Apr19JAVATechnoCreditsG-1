package jiniY;


import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers to do calcultion");
		System.out.println("Enter first number");
		double num1 = sc.nextDouble();
		System.out.println("Enter first number");
		double num2 = sc.nextDouble();

		new Calculator().calculator(num1, num2, sc);

	}

	void calculator(double num1, double num2, Scanner sc) {

		double result;

		System.out.println("Enter your choice:" + " " + "1.Addition" + " " + "2.Subtraction" + " " + "3.Multiplication"
				+ " " + "4.Division" + " " + "5.Exit");
		int ch = sc.nextInt();
		switch (ch) {

		case 1:
			result = num1 + num2;
			System.out.println(" ");
			System.out.println("Addition of" + " " + num1 + " " + "+" + " " + num2 + " " + "is:" + " " + result);
			System.out.println(" ");
			break;

		case 2:
			result = num1 - num2;
			System.out.println(" ");
			System.out.println("Subtraction of" + " " + num1 + " -" + " " + " " + num2 + " " + "is:" + " " + result);
			System.out.println(" ");
			break;

		case 3:
			result = num1 * num2;
			System.out.println(" ");
			System.out.println("Multiplication of" + " " + num1 + " " + "*" + " " + num2 + " " + "is:" + " " + result);
			System.out.println(" ");
			break;

		case 4:
			result = num1 / num2;
			System.out.println(" ");
			System.out.println("Division of" + " " + num1 + " " + "/" + " " + num2 + " " + "is:" + " " + result);
			System.out.println(" ");
			break;

		default:
			System.out.println(" ");
			System.out.println("Invalid choice");
			System.out.println(" ");
			break;

		case 5:
			System.out.println(" ");
			System.out.println("You have exited from system.");
			System.exit(0);//to exit from system

			break;
		}
		new Calculator().calculator(num1, num2, sc);
	}

}
