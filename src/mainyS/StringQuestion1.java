package mainyS;

//WAP to how many time constructor call
public class StringQuestion1 {
	static int count = 0;

	public StringQuestion1() {
		count++;
	}

	public static void main(String[] args) {
		StringQuestion1 q = new StringQuestion1();
		System.out.println(count);
	}
}
