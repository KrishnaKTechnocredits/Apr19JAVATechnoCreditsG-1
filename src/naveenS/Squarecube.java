package naveenS;

public class Squarecube {

	int x, y;

	int square(int x)

	{

		y = x * x;

		System.out.println("Square of no is :- " + y);

		return y;

	}

	int cube(int x)

	{

		y = x * x * x;

		System.out.println("Cube of no is :- " + y);

		return y;

	}

	public static void main(String[] args) {

		Squarecube sqrcub = new Squarecube();

		sqrcub.square(10);

		sqrcub.cube(20);

		// TODO Auto-generated method stub

	}

}
