package jiniY;

public class Pattern4 {

	void pattern4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < 2; j++) {
				if (i % 2 != 0)// for odd number of i
					System.out.print("1" +"\t" +"*" +"\t" +"3" +"\t" +"*");
				else// for even number of i

					System.out.print("*" +"\t" +"2" +"\t" +"*" +"\t" +"4");

			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Pattern4().pattern4();//call method

	}
}
