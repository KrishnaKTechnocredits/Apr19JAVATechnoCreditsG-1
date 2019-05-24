package jiniY;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for which you want factorial:");
		int num = sc.nextInt();

		new Factorial().fact(num);
	}

	void fact(int a) {
		int fact = 1;//initialize value 1 for fact buy default as 1 factorial is 1
		for (int i = 1; i <= a; i++) {//traverse till number given by user
			fact = fact * i;//multiply

		}
		System.out.println("Factorial for:" + a + " " + "is" + " " + fact);//result
	}

}
