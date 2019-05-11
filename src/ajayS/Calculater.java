package ajayS;

public class Calculater {

	void sum (int x, int y){
		System.out.println("sum of X and y is"+ (x+y));
	}
	
	void difference(int x, int y){
		System.out.println("difference of x and y is " + (x-y));
	}

	void division(int x, int y){
		System.out.println("the divison of x nad y is "+(x/y));
	}
	void multiplication(int x, int y){
		System.out.println("the mutliplication of x and y is " + (x*y));
	}
	void remainder(int x, int y){
		System.out.println(" the remainader of x/y is " +(x%y));
	}
	public static void main(String[] arg){
		Calculater calculater =new Calculater ();
		calculater.sum(45,20);
		calculater.difference(45,20);
		calculater.multiplication(45,20);
		calculater.division(45,20);
		calculater.remainder(45,20);
	}
	
}
