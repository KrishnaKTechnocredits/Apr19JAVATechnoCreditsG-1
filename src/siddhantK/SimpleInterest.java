package siddhantK;

public class SimpleInterest 
{

	public static void main(String[] args) 
	{
	 
		double SI = simpleInterest(2500,2,3);
		System.out.println("Simple Interest is "+SI);	
	}

	 static double simpleInterest(double P,double r, double t)
	{
		double SI = (P*r*t)/100;
		return SI;
	}
}
