package shantanuG;

public class Program6 {
	double degreeConversion(double fahrenheit)
	{
		return (fahrenheit-32)*5/9;
	}
	public static void main(String args[])
	{
		Program6 program6=new Program6();
		int fahrenheit=96;
		System.out.println("Temperature in celcius is:"+program6.degreeConversion(fahrenheit));
	}
}
