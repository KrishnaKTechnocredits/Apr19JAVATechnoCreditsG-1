package mainyS;

import java.util.Scanner;

//WAP to check if array contains a number
public class ArrayQ3 {
	static void number() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Array : ");
		String m = sc.nextLine();
		String[] arr = m.split(" ");
		System.out.println("Enter Number");
		int var = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) == var) {
				flag = true;
				System.out.println("Number is in array");
			}
		}
		if (flag == false) {
			System.out.println("Number is not in array");
		}
		sc.close();
	}

	public static void main(String args[]) {
		number();
	}
}
