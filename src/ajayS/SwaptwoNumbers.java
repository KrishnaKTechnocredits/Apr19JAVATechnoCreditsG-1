package ajayS;

public class SwaptwoNumbers {
	void swap(int x, int y) {
		System.out.println("before swap X is " + x + " and Y is " + y);
		int z = x;
		x = y;
		y = z;
		System.out.println("after swap X is " + x + " and Y is " + y);
	}

	public static void main(String[] args) {
		SwaptwoNumbers swaptwoNumbers = new SwaptwoNumbers();
		swaptwoNumbers.swap(18, 79);
	}

}
