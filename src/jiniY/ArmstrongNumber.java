package jiniY;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();

		new ArmstrongNumber().armstrongNumber(number);

	}

	void armstrongNumber(int number) {
		{
			int num = number;// keep value of number in some other integer to do
								// other calculation so that number value is not
								// changed and we need for further comparization
			int total = 0;
			int temp;

			while (num != 0) {
				temp = num % 10;//get remainder value
				total = total + (temp * temp * temp);//multiply and add
				num = num / 10;//get quotient value
			}
			if (total == number)//check total with original number value
				System.out.println("Number is Armstriong:" + number);
			else
				System.out.println("Number is not armstrong: " + number);

		}
	}

}
