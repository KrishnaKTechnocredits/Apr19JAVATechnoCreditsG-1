package jiniY;

public class Pattern2 {
	void pattern2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < 3; j++) {
				if (i % 2 != 0)// if i is odd print #*
					System.out.print("#" +"\t" +"*" +"\t" );
				else// else i is even print *#

					System.out.print("*" +"\t" +"#" +"\t" );

			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Pattern2().pattern2();// call method

	}

}
