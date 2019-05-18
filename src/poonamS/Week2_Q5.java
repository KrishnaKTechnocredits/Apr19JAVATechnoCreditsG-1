package poonamS;

public class Week2_Q5 {

	void m1()
	{
		for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
		Week2_Q5 q5 = new Week2_Q5();
		q5.m1();
	}
	
}
