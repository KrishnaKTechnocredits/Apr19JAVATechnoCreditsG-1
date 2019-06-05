package dataType;

//implicit type casting
public class DataTypeExp1 {

	void exp2() {
		// float x =10.0f; //(float)10.0;
		// float= double
		// 4byte=8byte
		/// byte b = (byte)130;

		float f1 = 10.29f;
		double d1 = f1;
		// double d1 =10; //implicit type casting
		f1 = (float) d1;
		System.out.println(f1);
	}

	// void exp1() {
	// int x =9/4; //ans=2
	// System.out.println(x);
	// double x = (double)(9/4); //ans=2.0
	// double x=(double)9/4; //ans=2.25
	// double x = 9/4; //ans=2.0
	// double x =9/4.0; //ans=2.25
	// int x = (int)9.0/4; //ans=2
	// int x = (int)(9/4); //ans=2
	// int x =(9.0/4); //error
	// int x = (int) (9.0 / 4); // convert 9.0 t0 9 as we have define integer
	// System.out.println(x);
	// }

	public static void main(String[] args) {
		DataTypeExp1 d1 = new DataTypeExp1();
		d1.exp2();

	}

}
