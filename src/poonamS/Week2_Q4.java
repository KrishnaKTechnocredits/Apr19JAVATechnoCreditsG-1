package poonamS;

public class Week2_Q4 {

	void m1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i % 2 != 0) {
					if (j % 2 != 0)
						System.out.print(j + " ");
					else
						System.out.print("* ");
				} else {
					if (j % 2 == 0)
						System.out.print(j + " ");
					else
						System.out.print("* ");
				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Week2_Q4 q4 = new Week2_Q4();
		q4.m1();
	}

}
