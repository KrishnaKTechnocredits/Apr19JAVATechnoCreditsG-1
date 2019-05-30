package swapanaW;

//Create a class Addition and write add method for integers, decimal, string.

public class AdditionOverloading {

	public static void main(String[] args) {
		AdditionOverloading ad = new AdditionOverloading();
		ad.add(3, 9);
		ad.add(3.2, 2.4);
		ad.add("12", "15");
	}

	void add(int x, int y) {
		System.out.println("Addition of integer : " + x + y);
	}

	void add(double x, double y) {
		System.out.println("Addition of decimal : " + (x + y));
	}

	void add(String x, String y) {
		System.out.println("Addition of String : " + (Integer.parseInt(x) + Integer.parseInt(y)));
	}
}
