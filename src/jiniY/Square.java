package jiniY;

public class Square {

	int side;

	Square(int side)// constructor with one parameter
	{
		this.side = side;// when both names are same and to assign the same
							// value in instance variable use this keyword
	}

	void area()// method declaration with body
	{
		int area;
		area = side * side;
		System.out.println("Area of Sqaure is :" + area);
	}
}