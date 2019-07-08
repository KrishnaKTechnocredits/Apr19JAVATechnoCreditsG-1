package mainyS;
//WAP for square with field, one parameterized constructor with accept side......
public class Square {
	
	int side=0;
	
	Square(int s)
	{
		side=s;
	}
	
	void areaSquare()
	{
		int area = side*side;
		System.out.println("Area of Square is : " + area);
	}

}
