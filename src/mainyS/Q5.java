package Java_Assigment1;
//WAP to compute simple interest
public class Q5 {

	void interest(int P, int T, int R) {
		float interest = (P * T * R) / 100;
		System.out.println("Interest is = " + interest);
	}

	public static void main(String args[]) {
		Q5 q5 = new Q5();
		q5.interest(25000, 2, 12);
	}

}
