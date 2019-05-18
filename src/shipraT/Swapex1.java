package shipraT;

public class Swapex1 {  //Program swap two numbers using the third variable
	
	
public static void main(String[] args) {
	int x =10;
	int y=20;
	
	//swap the value
	swap(x,y );//calling static to static 
}
	
public static void swap(int x, int y) {
	int temp = x;
		x=y;
		y=temp;
	System.out.println("value of x is :" +x);
	System.out.println("value of y is : " +y);
}

}
