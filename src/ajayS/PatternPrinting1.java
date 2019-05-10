package ajayS;

public class PatternPrinting1 {//method to display pattern1 
	
	void pattern1(int row){ //method to print # on even rows and * on odd rows  
		
		for (int i = 1; i<=row; i++){ // for loop to print n number of  rows
			 for (int j = 1;j<= i; j++){ // for loop to print * or # in any row for n number of times
				 if (i%2==0)
					 System.out.print("# ");
				 else  
				 System.out.print("* ");
			 }System.out.println();
			
		}
		
		
		
	}
	
	public static void main (String [] args){
		new PatternPrinting1().pattern1(4);
	}
	
	

}
