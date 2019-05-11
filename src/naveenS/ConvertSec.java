package naveenS;

public class ConvertSec {

	int sec, min, hr;
	 static int p1;
	 static int p2;
	 static int p3;

	static void convert(int sec)

	{

		 p1 = sec % 60;

		 p2 = sec / 60;

		 p3 = p2 % 60;

		p2 = p2 / 60;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input seconds: ");

		// ConvertSec convert1 = new ConvertSec();

		convert(4400);

		System.out.print("HH:MM:SS - " + p2 + ":" + p3 + ":" + p1);

		System.out.print("\n");

	}

}
