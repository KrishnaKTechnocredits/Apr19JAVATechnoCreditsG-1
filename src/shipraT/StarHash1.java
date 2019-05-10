package shipraT;

public class StarHash1 {
	public static void starhash() { // method creation

		for (int i = 1; i <= 4; i++) {       //we want output this
                                                  //*
			for (int j = 1; j <= i; j++) {       //# #
                                                //* *  *
				if (i % 2 == 1) {              //#  #  #   #

					System.out.print("*");     

				}

				else if (i % 2 == 0) {

					System.out.print("#");

				}

			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		starhash(); // calling static method directly
	}
}
