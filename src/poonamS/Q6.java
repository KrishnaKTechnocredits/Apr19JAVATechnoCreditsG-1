package poonamS;

public class Q6 {

	//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	// Celsius = (fahrenheit - 32) * 5 / 9
	
	void temp(float f)
	{
		System.out.println("Temperature in Celcius is " + ((f-32)*5/9));
	}
	
	public static void main(String[] args) {
		Q6 q6= new Q6();
		q6.temp(72);
	}
	
}
