package swapanaW;

public class SimpleInterest {

	static void si(int p, int t, double r)
	{
		double si = (p*t*r)/100;
		
		System.out.println("The simple interest for principal "+p + ", for duration(in years) "+ t+" and with rate of interest " +r +" is : "+si);
	}

	public static void main(String[] args) {
		si(1000,6,1.2);
	}
}