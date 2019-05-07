package swapanaW;

public class SquareCube {

	int square(int x)
	{
		x=x*x;
		System.out.println(x);
		return x;
	}
	
	int cube(int y)
	{
		y=y*y*y;
		System.out.println(y);
		return y;
	}
	public static void main(String[] args) {
		
		new SquareCube().square(12);
		new SquareCube().cube(12);
	}
}