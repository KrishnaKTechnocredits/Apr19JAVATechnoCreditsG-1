package sushantD;

import java.util.Scanner;

public class Splitstring {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		
		String fname=data[0];
		String lname=data[1];
		int count = Integer.parseInt(data[2]);
		
		for(int i= 1; i<data.length;i++) {
			System.out.println(data[i]);
			i++;
		}
		
		
	}

}
