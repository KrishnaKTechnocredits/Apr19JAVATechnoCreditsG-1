package sushantD;

import java.util.Scanner;

public class EqualityofArrays {
	public static void main(String[] args) {

		System.out.println("enter the size of arrays");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int firstarray[] = new int[size];
		int secondarray[] = new int[size];

		System.out.println("enter elements for first array");

		for (int i = 0; i < size; i++) {

			firstarray[i] = sc.nextInt();

		}
		System.out.println("enter elements for second array");

		for (int j = 0; j < size; j++) {

			secondarray[j] = sc.nextInt();

		}

		if (arraysEquality(firstarray, secondarray))
			System.out.println("arrays you have entered are same");
		else
			System.out.println("arrays are different");
		
		difindex(firstarray, secondarray);

	}

	public static boolean arraysEquality(int[] a, int[] b) {
		Integer index= null;
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				
			
				return false;
				

		}
		
		
		return true;
	}
	
	static void difindex(int[] a, int[] b) {
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				if(!(a[i]==b[j])) {
					System.out.println(a[i] +" "+b[j]);
				}
				
			}
		}
		
	}

}
