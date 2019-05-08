package jiniY;

public class Pattern3 {
	
void pattern3() {
		
		for (int i = 1; i <= 4; i++) {//for outer loop
			for (int j = 4; j >=i; j--) {//for inner loop in decrementing order
			
					System.out.print(j+"\t");
				
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Pattern3().pattern3();//call method

	}

}
