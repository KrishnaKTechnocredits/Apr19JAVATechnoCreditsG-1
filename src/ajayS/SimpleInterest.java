package ajayS;

public class SimpleInterest {
	
	void simpleInterest(int P,double T, double R){
	
	double si = (P*T*R)/100;
	System.out.println(si);
	}
	
public static void main (String [] args){
	SimpleInterest simpleInterest = new SimpleInterest();
	simpleInterest.simpleInterest(1000,5,3);
	simpleInterest.simpleInterest(10000, 2.2, 4.5);
}
}
