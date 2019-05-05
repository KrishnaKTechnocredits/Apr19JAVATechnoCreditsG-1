package jiniY;

public class SwapWithUsing3rdNo {

	void swap(int x, int y) {
		int temp;
		System.out.println("Before swapping value of x and y is :" + " " + x + " " + y);
		temp = x;// temp 20
		x = y;// x = 21
		y = temp;// x = 20
		System.out.println("After swapping value of x and y is :" + " " + x + " " + y);

	}

	public static void main(String[] args) {
		new SwapWithUsing3rdNo().swap(20, 21);
	}

}
