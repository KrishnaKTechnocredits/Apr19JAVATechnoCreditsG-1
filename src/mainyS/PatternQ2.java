package mainyS;
/*WAP to print following
# * # *
* # * #
# * # * 
* # * # */

public class PatternQ2 {
	static void pattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				int z= i+j;
				if (z % 2 == 0) {
					System.out.print("#" + " ");
				}
				else
				{
					System.out.print("*" + " ");
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern();
	}
}
