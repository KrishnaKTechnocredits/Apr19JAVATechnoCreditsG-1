package shantanuG;

public class Addition {
	int add(int num1,int num2)
	{
		return num1+num2;
	}
	
	float add(float num1,float num2)
	{
		return num1+num2;
	}
	
	String add(String str1,String str2)
	{
		return str1+str2;
	}
	
	public static void main(String args[])
	{
		Addition addition=new Addition();
		System.out.println("Addition of 2 integers is:"+addition.add(10,20));
		System.out.println("Addition of 2 decimal numbers is:"+addition.add(12.5f, 10.8f));
		System.out.println("Concatenation of 2 strings is:"+addition.add("Shantanu", "Ghanekar"));
	}

}
