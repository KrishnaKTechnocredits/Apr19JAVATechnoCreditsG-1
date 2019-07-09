package ajayS;
import java.util.Scanner;

public class SaprateDigitsAndCharacterInString {
	void saprateDigitsAndNumber (String string){//method to separate digits and characters in given string
		String digits= "";
		String characters = "";
		String seprated ="";
		for (int i =0;i< string.length();i++){
			if (string.charAt(i)== '0' || string.charAt(i)== '1'||string.charAt(i)== '2'||string.charAt(i)== '3'||string.charAt(i)== '4'||string.charAt(i)== '5'||string.charAt(i)== '6'||string.charAt(i)=='7'||string.charAt(i)== '8'||string.charAt(i)== '9' ){
				digits=digits+string.charAt(i);
			} else {
				characters = characters+string.charAt(i);
			}
		}System.out.println(digits+" "+characters);
	}
	public static void main(String [] args ){
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the string ");
		String string = scanner.next();
		SaprateDigitsAndCharacterInString saprateDigitsAndCharacterInString = new  SaprateDigitsAndCharacterInString();
		saprateDigitsAndCharacterInString.saprateDigitsAndNumber(string);
		
	}

}
