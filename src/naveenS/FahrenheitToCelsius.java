package naveenS;

public class FahrenheitToCelsius {

	float temperature;

	Float fahrenheittocelsius1(float temperature)

	{

		Float temperature1 = ((temperature - 32) * 5) / 9;

		System.out.println("temperature in Celsius = " + temperature);

		return temperature1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FahrenheitToCelsius frcel = new FahrenheitToCelsius();

		System.out.println("Entered temperature in Fahrenheit " + frcel.fahrenheittocelsius1(100.3f));
	}

}
