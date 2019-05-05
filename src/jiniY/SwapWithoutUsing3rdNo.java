package jiniY;

public class SwapWithoutUsing3rdNo {

	void swap(int x, int y) {
	
		System.out.println("Before swapping value of x and y is :" + " " + x + " " + y);
		y = x;// y = 21
		x= y;//x =  20		
		System.out.println("After swapping value of x and y is :" + " " + x + " " + y);

	}

	public static void main(String[] args) {
		new SwapWithUsing3rdNo().swap(20, 21);
	}
}
