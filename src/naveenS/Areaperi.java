package naveenS;

public class Areaperi {

	int x, y, z, k;

	int perirect(int x)

	{

		int z = 2 * (x + y);

		System.out.println("perimeter of rectangle is :- " + z);

		return z;

	}

	int arearect(int x, int y)

	{

		z = x * y;

		System.out.println("Are of rectangle no is :- " + z);

		return z;

	}

	int pericircle(int x)

	{

		int z = (int) ((2) * (3.14) * (x));

		System.out.println("perimeter of circle is :- " + z);

		return z;

	}

	int areacircle(int x)

	{

		int z = (int) (3.14 * x * x);

		System.out.println("Area of circle is :- " + z);

		return z;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Areaperi sqrcub = new Areaperi();

		sqrcub.perirect(10);

		sqrcub.arearect(20, 10);

		sqrcub.pericircle(10);

		sqrcub.areacircle(20);

	}

}
