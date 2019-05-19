package sushantD;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner sc = new Scanner(System.in);
		int[] number = new int[9];
		for(int i =0;i<number.length;i++) {
			number[i]=sc.nextInt();
			
		}
		
		MissingNumber ex2 = new MissingNumber();
		//ex2.display(number);
		ex2.findMissingNumber(number);
	}
	
	
	void findMissingNumber(int[] number) {
		for(int i = 1;i<10;i++) {
			boolean flag= false;
			for(int j=0;j<number.length;j++) {
				if(i==number[j]) {
					flag = true;
					break;
				}
				
			}
			
			if(flag == false) {
				System.out.println("missing number is "+i);
			}
		}
		
	}
	
	void display(int[] num){
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
	}

}
