package siddhantK;

public class SquareCubeNumber {

	public static void main(String[] args) {
		
	SquareCubeNumber scn =new SquareCubeNumber();

    double square = scn.square(11);
    System.out.println("Square is " +square);
    
    double cube = scn.cube(12);
    System.out.println("Cube is " +cube);

	}
	
	public double square(int sq)
	{
		
		double ans= sq*sq;
		return ans;
		
	}
	
	public double cube(int cu)
	{
		double ans= cu*cu*cu;
		return ans;
		
		
	}

}
