package swapanaW;

public class Degree {

	void convert(float f)
	{
		float c = (f-32)*5/9;
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		new Degree().convert(89);
	}

}