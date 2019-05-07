package ajayS;

public class AreaAndPerimeter {
	
	 void areaOfRect(int w, int l){
		 System.out.println("area of rectangle is "+ w*l);
		 //return w*l;
	}
	void  perimeterOfRect(int w, int l){
	System.out.println("Perimeter of rectangle  is "+ (2*(w+l)));
	//return 2*(l+w);
	}

	void  areaOfCircle(int r){
		 System.out.println("area of circle is "+ 3.141*r*r );
		// return (3.14*r*r);
	}
	void  perimeterOfCircle(int r){
	System.out.println("Perimeter of rectangle  is "+ 6.182*r );
	//return 6.18*r;
	}
public static void main(String [] args){
	
	AreaAndPerimeter areaAndPerimeter = new AreaAndPerimeter();
	areaAndPerimeter.areaOfRect(6, 9);
	areaAndPerimeter.perimeterOfRect(8, 7);
	areaAndPerimeter.areaOfCircle(20);
	areaAndPerimeter.perimeterOfCircle(40);
}



}



