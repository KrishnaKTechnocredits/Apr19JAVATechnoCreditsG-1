package poonamS;

public class ArrayQ7 {

	// 7) Find all pairs on integer array whose sum is equal to given number?
	// Hint: You have given an integer array and a number, you need to write a
	// program to find all elements in the array whose sum is equal to the given
	// number. Remember, the array may contain both positive and negative
	// numbers, so your solution should consider that. Input:2, 4, 3, 5, 7, 8, 9
	// Given sum:7 Integer numbers, whose sum is equal to value:7 (2, 5) (4, 3)
	
	
	void m1(int[] a, int n)
	{
		for(int i=0; i < a.length; i++)
		{
//			int var;
//			var = i+1;
//			if(var > a.length-1)
//				break;
			
			for (int j=i+1; j < a.length; j++)
			{
			if(a[i]+a[j]==n)
				{
					System.out.println("Numbers whose sum is 7 are " + a[i] + "," + a[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {2, 4, 3, 5, 7, 8, 9};
		int num = 7;
		
		ArrayQ7 q7 = new ArrayQ7();
		q7.m1(a, num);
	}
}
