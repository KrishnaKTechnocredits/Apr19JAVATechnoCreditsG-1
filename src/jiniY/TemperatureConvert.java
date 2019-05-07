package jiniY;

public class TemperatureConvert {

	double celToFar(int f) {
		double c;
		System.out.println("Temperature conversion Farhrenit to Celsius degree is:" + "" + (c = ((f * 9) / 5) + 32));
		return c;
	}

	    public static void main(String[] args) {
		new TemperatureConvert().celToFar(20);
	}

}
