package ajayS;
import java.util.Scanner;
public class PalidromeString {
	void palidromCheck(String string){//method to check a user given string is palidrome or not 
		String reversedString="";
		for (int i =string.length()-1 ; i>=0; i--){
			reversedString = reversedString+string.charAt(i);
		}if (reversedString.equals(string)){
			System.out.println("number is palidrome");
		} else 
			System.out.println("number is  not palidrome");
	}
 public static void  main(String[] args){
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("please enter the string");
	 String string= scanner.nextLine();
	 PalidromeString palidromeString = new PalidromeString();
	 palidromeString.palidromCheck(string);
 }
 
 
}
