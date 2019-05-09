package shipraT;

import java.util.Scanner;

public class SecondTohour {
	public static void main(String[] args) {
		int second =0;
		int minitues =0;
		int hour =0;
		
	Scanner sc = new Scanner(System.in);	//Scanner class to read value
	
		System.out.println("how many seconds ?");
			second = sc.nextInt();
			  if(second>=60) {
				  minitues = second/60;
			  }
			  if(minitues>=60){
			      hour=minitues/60;
			    }
			    System.out.println(second + "s = " + hour + " h " + minitues + " m " + second + "s ");
			  }
			}
