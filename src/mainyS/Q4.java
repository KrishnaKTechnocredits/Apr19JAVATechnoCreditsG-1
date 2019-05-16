package mainyS;

//WAP to find the area and perimeter of Rectangle and circle
public class Q4 {
	float pi = 3.14f;

	void rectangle(int l, int w) {
		int area = l * w;

		System.out.println("area of Rectangle = " + area);
	}

	void perimeterRectangle(int l, int w) {
		int perimeter = 2 * (l + w);
		System.out.println("Perimeter of Rectangle = " + perimeter);

	}

	void circle(int r) {
		float area = pi * r * r;
		System.out.println("area of circle is = " + area);

	}

	void perimeterCircle(int r) {
		float perimeter = 2 * pi * r;
		System.out.println("perimeter of cicrcle is = " + perimeter);

	}

	public static void main(String args[]) {
		Q4 q4 = new Q4();
		q4.rectangle(5, 6);
		q4.circle(5);
		q4.perimeterRectangle(5, 6);
		q4.perimeterCircle(5);
	}

}
