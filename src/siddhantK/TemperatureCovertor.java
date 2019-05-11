package siddhantK;

public class TemperatureCovertor {

	public static void main(String[] args) {
	double celsius = celsiusToFarhenheitCalc(100);
	System.out.println("Equivalent Celius conversion of 100F to Celsius "+celsius);
	}

	static double celsiusToFarhenheitCalc(double F)
	{
		double c = (F-32)*5/9;
		return c;
	}
}
