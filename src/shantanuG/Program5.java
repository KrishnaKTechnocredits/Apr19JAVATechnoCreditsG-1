package shantanuG;

public class Program5 {

	double simpleInterest(double amount, double year, double rate)
	{
		return (amount*year*rate)/100;
	}
	public static void main(String args[])
	{
		Program5 program5=new Program5();
		System.out.println("Simple interest is:"+program5.simpleInterest(500,2,5));
	}
}
