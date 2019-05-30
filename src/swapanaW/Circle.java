package swapanaW;

// Classes and Objects : Circle class with Area and Circumference method.

public class Circle {

	float radius;

	void initiate() {
		radius = 5;
		System.out.println("Radius of circle : " + radius);
	}

	void areaCircle() {
		float area = (float) (3.14 * radius * radius);
		System.out.println("Area of circle: " + area);
	}

	void circumferenceCircle() {
		float circumference = (float) (2 * 3.14 * radius);
		System.out.println("Circumference of circle: " + circumference);
	}
}
