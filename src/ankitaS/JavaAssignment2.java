package ankitaS;

public class JavaAssignment2 {
	
	//To Print Pattern : 4 3 2 1     4 3 2     4 3    4
		static void m1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;i<=j;j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	
	//To Print Pattern : *   # #    * * *    # # # #
	static void m2()
	{
		for(int i=1;i<=4;i++)
		{
			if(i%2==0)
			{
				for(int j=1; j<= i; j++)
				{
					System.out.print("#" + " ");
				}
			}
			else
			{
				for(int j=1; j<= i; j++)
				{
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}
	}
	
	//To Print Pattern : 1 * 3 *      * 2 * 4     1 * 3 *     * 2 * 4
	static void m3()
	{
		for(int i=0;i<=3;i++){
			for(int j=1; j<=4; j++){
					if(j%2==i%2)
					System.out.print("*" + " ");
					else
						System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	//To Print Pattern : 1    1 2    1 2 3    1 2    1
	static void m4()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i=3; i>=1; i--)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	
	//To Print Pattern : 3 6 9     12 15 18     21 24 27
	static void m5()
	{
		
		for(int i=1;i<10;i++){
			System.out.print(i*3);
			System.out.print(" ");
			
			if(i%3==0){
				System.out.println();
			}
		}
	}
	
	
	//To Print Pattern : # * # *     * # * #     # * # *      * # * #
	static void m6()
	{
		for(int i=0;i<=3;i++){
			for(int j=1; j<=4; j++){
					if(j%2==i%2)
					System.out.print("*" + " ");
					else
						System.out.print("# ");
			}
			System.out.println();
		}
	}	
	
	public static void main(String args[]){
		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
	}
}