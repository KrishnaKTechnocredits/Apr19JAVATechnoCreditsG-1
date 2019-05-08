package assignments;

public class Q5 {

	//Write a Java program to compute simple interest 
	
	void si(int p, double r, int t)
	{
		System.out.println("Simple interest calculated for principle amount = " + p + " for duration of " + t + " years with rate of interest as " + r + " is " + ((p*r*t)/100));
	}
	
	public static void main(String[] args) {
		Q5 q5 = new Q5();
		q5.si(10000, 6.5, 2);
	}
	
}
