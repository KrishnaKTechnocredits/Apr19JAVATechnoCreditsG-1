package mainyS;
//WAP to compute simple interest
public class Q5 {

	void simpleInterest(int P, int T, int R) {
		float interest = (P * T * R) / 100;
		System.out.println("Interest is = " + interest);
	}

	public static void main(String args[]) {
		Q5 q5 = new Q5();
		q5.simpleInterest(25000, 2, 12);
	}

}
