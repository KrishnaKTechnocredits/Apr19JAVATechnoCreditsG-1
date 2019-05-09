package shipraT;

public class SimpleInterest {
	
public void calculateinterest() {
	float p =5000, r = 12, t =2, simpleInterest; 
	//P is the principal amount , R is the rate ,T is the Time of year
	
	simpleInterest =(p*r*t)/100; //formula of calculate interest
	
	System.out.println("Simple interest is :" + simpleInterest);
	
	
}
public static void main(String[] args) {
	SimpleInterest si = new SimpleInterest();
		si.calculateinterest(); //calling method with reference
}

}
