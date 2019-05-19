package sushantD;

import java.util.Scanner;

public class CommonElementsTwoArrays {
	public static void main(String[] args) {
		commonelements();

	}

	static void commonelements() {
		System.out.println("enter the size of arrays");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		boolean flag = false;
		System.out.println("enter elements for first arrays");

		int firstarray[] = new int[size];
		int secondarray[] = new int[size];

		for (int i = 0; i < size; i++) {

			firstarray[i] = sc.nextInt();
			
		}
		System.out.println("enter elements for second arrays");
		
		for (int j = 0; j < size; j++) {

			secondarray[j] = sc.nextInt();
			
		}
		
		for(int i=0;i<firstarray.length;i++) {
			for (int j =0;j<secondarray.length;j++) {
				if(firstarray[i]==secondarray[j]) {
					flag=true;
					System.out.println("common elements in both arrays are :"+firstarray[i]);
				}
				
			}
		}
		
		if(flag==false) {
			System.out.println("no common element found in both arrays");
		}

		}
		

		
		
		

	}


