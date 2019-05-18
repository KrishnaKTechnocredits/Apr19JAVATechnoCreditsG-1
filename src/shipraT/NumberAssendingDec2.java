package shipraT;

public class NumberAssendingDec2 {    //we want output like this
                                      // 4 3 2 1
	public static void number() {    //  4 3 2
		int n=4;                    //   4 3
		                           //    4
		for(int i=n;i>0;i--) {
			
			for(int j=0;j<i;j++) {
				
			
				
				System.out.print(n-j); 
				
			}
			System.out.println("");
		}
		
	} 
	public static void main(String[] args) {
		number();
	}
}
