package naveenS;

public class SimpleIntrest {

	int P, R, T, Simple_Interest;

	int perirect(int P, int R, int T)

	{

		Simple_Interest = (P * T * R) / 100;

		System.out.println("Simple Intrest is :- " + Simple_Interest);

		return Simple_Interest;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleIntrest perirect = new SimpleIntrest();

		perirect.perirect(10, 20, 30);

	}

}
