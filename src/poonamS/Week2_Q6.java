package poonamS;

public class Week2_Q6 {

	int count = 0;

	void m1()
	{
	for(int i = 1;i<=9;i++)
	{
		System.out.print(i * 3 + " ");
		count = count + 1;
		if (count == 3) {
			System.out.println();
			count = 0;
		}
	}
}
	
	public static void main(String[] args) {
		Week2_Q6 q6= new Week2_Q6();
		q6.m1();
	}
	
}