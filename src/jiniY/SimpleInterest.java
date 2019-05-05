package jiniY;

public class SimpleInterest {

	double simpleInterest(int p, int r, int t) {
		double amt;
		System.out.println("Simple Interest  :" + " " + (amt = (p * t * r) / 100));
		return amt;
	}

	public static void main(String[] args)
	{
		double si = new SimpleInterest().simpleInterest(200, 12, 5);
	}

}
