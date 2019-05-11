package Java_Assigment1;

//WAP to swap two numbers using third variable
public class Q8 {

	void swap(int x, int y) {
		System.out.println("x is = " + x + " and y is = " + y);

		int z = y;
		y = x;
		x = z;

		System.out.println("x is = " + x + " and y is = " + y);
	}

	public static void main(String args[]) {
		Q8 q8 = new Q8();
		q8.swap(100, 300);
	}

}
