/**
 * 
 */
package ajayS;

/**
 * @author AJAY
 *
 */
public class SquareAndCube {
	 
	
	int square(int x){
		System.out.println("square of "+ x+" is "+ (x*x) );
		return (x*x);
	}
	
	int cube (int x){
		System.out.println("cube  of "+ x+ " is "+ (x*x*x) );
		return (x*x*x);
	}
	 public static void  main(String[] args){
		 SquareAndCube squareAndCube=new SquareAndCube();
		 System.out.println("square "+squareAndCube.square(8));
		 System.out.println("cube "+squareAndCube.cube(9));
	 }

}
