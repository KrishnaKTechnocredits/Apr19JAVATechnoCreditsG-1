package jiniY;

public class AreaPerimeter {

	void square(int a) {
		System.out.println("Area of Square is:" + " " + (a * a));
		System.out.println("Perimeter of Square is:" + " " + (4 * a));

	}

	void rectangle(int a, int b) {
		System.out.println("Area of Rectangle is:" + " " + (a * b));
		System.out.println("Perimeter of Rectangle is:" + " " + (2 +(a * b)));

	}

	public static void main(String[] args) {
		AreaPerimeter areaPerimeter = new AreaPerimeter();
		areaPerimeter.square(2);
		System.out.println("");
		areaPerimeter.rectangle(3, 2);

	}
}
