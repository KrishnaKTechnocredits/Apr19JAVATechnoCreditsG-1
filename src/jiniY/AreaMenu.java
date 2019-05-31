package jiniY;

import java.util.Scanner;

public class AreaMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		new AreaMenu().area(sc);
	}

	void area(Scanner sc) {

		double area = 0;
		System.out.println("1.Area of rectangle" + " 2.Area of Circle" + "3.Area of Triangle" + " 4.Exit");// menus
		System.out.println("Enter your choice for which you want area to be calculated:");
		int num = sc.nextInt();// get input
		switch (num) {
		case 1:// case for rectangle
			System.out.println("");
			System.out.println("Enter length");
			int length = sc.nextInt();
			System.out.println("Enter breadth");
			int breadth = sc.nextInt();
			area = length * breadth;
			System.out.println(" ");
			System.out.println("Area of Rectangle is :" + " " + area);
			break;

		case 2:// case for circle
			System.out.println("");
			System.out.println("Enter radius");
			double radius = sc.nextDouble();
			area = 3.14 * radius * radius;
			System.out.println(" ");
			System.out.println("Area of Circle is :" + " " + area);
			break;

		case 3:// case for triangle

			System.out.println("");
			System.out.println("Enter base");
			int base = sc.nextInt();
			System.out.println("Enter height");
			int height = sc.nextInt();
			area = (1 * base * height) / 2;
			System.out.println(" ");
			System.out.println("Area of Triangle is :" + " " + area);
			break;

		case 4:// case to exit
			System.out.println(" ");
			System.out.println("You have exited from system");
			System.exit(0);// to exit from switch case
			break;

		default:// if any other input value given print this
			System.out.println(" ");
			System.out.println("Wrong choice");
			break;

		}
		System.out.println(" ");
		new AreaMenu().area(sc);// method recalled to avoid compilation again
								// and again and menus can be called until exit
	}
}
