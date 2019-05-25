package ajayS;
import java.util.Scanner;

public class ReverseString {//method to print reverse string in array
	 String printReverseString(String [] names ){
		 String  string ="";
		 for (int i= names.length -1; i>=0;i--){
			 String word = "";
		 for (int j = names[i].length()-1; j>=0;j--){
			 word=word+(names[i].charAt(j));
		 }string= string+word+" ";

		 }
		 
		return string;
	}
	
	
	public static void main (String [] args){
		Scanner scanner= new Scanner(System.in) ;
		System.out.println("enter the array");
		String input = scanner.nextLine();
		String [] names = input.split(" ");
		ReverseString reverseString = new ReverseString();
		
		String reversedString= reverseString.printReverseString(names);
		System.out.println(reversedString);
		
	}

}
