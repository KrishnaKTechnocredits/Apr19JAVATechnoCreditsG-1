package shipraT;

import java.util.Scanner;

public class FahrenheitToCelsius {
public static void main(String[] args) {
	float temprature;
	Scanner in = new Scanner(System.in);
		System.out.println("Enter temprature in Fahrenheit");
			temprature = in.nextInt();
			temprature = (temprature -32)*5/9; //formulla of temprature
			
		System.out.println("temprature  in celsius =" +temprature);
}
}
