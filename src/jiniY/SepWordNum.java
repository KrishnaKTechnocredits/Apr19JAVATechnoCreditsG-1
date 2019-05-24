package jiniY;

import java.util.Scanner;

public class SepWordNum {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter object array");
		String str = "";
		System.out.println(str);

		str = sc.nextLine();

		String[] arr = str.split(",");
		

		String[] numeric = new String[arr.length];
		String[] alpha = new String[arr.length];

		boolean flag = false;
		boolean flag_char = false;

		for (int i = 0; i < arr.length; i++) {

			String str1 = arr[i];
			for (int j = 0; j < str1.length(); j++) {
				if (((int) str1.charAt(j) >= 97) && ((int) str1.charAt(j) <= 122)) {
					flag_char = true;
				}else {
					flag_char = false;
				}
					
				if (((int) str1.charAt(j) >= 48) && ((int) str1.charAt(j) <= 57)) {
					flag = true;
				} else {
					flag = false;
				}
				
			}
			if(flag_char == true){
				alpha[i] = str1;
			}
			if(flag == true){
				numeric[i] = str1;
			}
			
				
		}
		
		System.out.print("Alpha are: ");
		for(int index=0;index<alpha.length;index++)
		{
			if(alpha[index] != null){
				System.out.print(alpha[index]+",");
			}
		}
		
		System.out.print("\nNumeric nums are: ");
	
		for(int index=0;index<numeric.length;index++)
		{
			if(numeric[index] != null){
				System.out.print(numeric[index]+",");
			}
			
		}
		


		}

}
