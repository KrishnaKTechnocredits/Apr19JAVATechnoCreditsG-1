package shipraT;

import java.util.Scanner;

public class PerimeterRC {
	int radious,length, width;
	double pi =3.14,perimeter;
	Scanner s = new Scanner(System.in);
	
public void circle() {
	System.out.println("Enter radious of circle :");
	  radious =s.nextInt();
	  perimeter = 2 *pi *radious; //formulla perimeter of circle =2*pi*radious
	System.out.println("perimeter of circule :" +perimeter); 
  }

public void rectangle() {
	System.out.println("Enter length of rectangle");
		 length = s.nextInt();
	System.out.println("Enter width of rectangle");
		 width =s.nextInt();
		 perimeter = 2*(length +width);   // perimeter of rectangle  = 2*(length+width)
	System.out.println("perimeter of rectangle :" + perimeter);	
	
		
		} 

public static void main(String[] args) {
	PerimeterRC prc = new PerimeterRC();
		prc.circle();
		prc.rectangle();
	
}
	

}
