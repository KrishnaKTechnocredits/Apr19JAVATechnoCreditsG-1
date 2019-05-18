package shipraT;

import java.util.Scanner;

public class Swapex2 {
	//swap two numbers without using the third variable
	
public static void main(String[] args) {
	    int a,b;
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter value of a: ");
	  		a=sc.nextInt();
	 System.out.println("Enter value of b: ");
	 		b=sc.nextInt();
	 	//swap two variable value without using third variable 
	 	     a=a+b;
	 	     b=a-b;
	 	     a=a-b;
	 	System.out.println("After swapping - a: "+ a +", b: " + b);
	 
}

}
