package swapanaW;

import java.util.Scanner;

/* Reverse number as Integer not as String */

public class ReverseNos {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		reverseNumber(num);
	}

	static void reverseNumber(int n) {
		int revno = 0;
		while (n != 0) {
			revno = revno * 10;
			revno = revno + n % 10;
			n = n / 10;
		}
		System.out.print("Reverse number is : " + revno);
	}
}