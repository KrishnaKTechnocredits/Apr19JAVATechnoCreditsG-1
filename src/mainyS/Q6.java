package mainyS;

//WAP convert temperature  from fahrenheit to celsius degree
public class Q6 {
	void fahrenheit(int fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(celsius + " celsius");
	}

	public static void main(String args[]) {
		Q6 q6 = new Q6();
		q6.fahrenheit(400);
		q6.fahrenheit(50);
	}

}
