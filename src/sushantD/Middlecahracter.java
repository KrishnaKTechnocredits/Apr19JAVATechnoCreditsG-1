package sushantD;

import java.util.Scanner;

public class Middlecahracter {
	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		
		int index=name.length()/2 -1;
		
		for(int i =0;i<name.length();i++) {
			if(index % 2 ==0) {
				System.out.println("middle character is "+name.charAt(index));
				
			}
			else {
				System.out.println("middle character is "+name.charAt(index -1));
			}
			
			
		}
		
		
	}

}
