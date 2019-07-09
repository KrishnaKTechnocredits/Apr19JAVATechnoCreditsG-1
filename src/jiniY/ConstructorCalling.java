package jiniY;

//WAP to know how many times constructor call print count of constructor calling

public class ConstructorCalling {

	static int count=0;
	
	ConstructorCalling()
	{
		count++;
	
	}
	public static void main(String[] args) {
		
		
		ConstructorCalling cc = new ConstructorCalling();
		ConstructorCalling cc1 = new ConstructorCalling();
		System.out.println(" Constructor is called" +" " +count +" " +"times.");
	}
	
	
}