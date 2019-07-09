package poonamS;

public class ArrayQ5 {
	
	//5)Write a java program to find second largest element in an array of integers?
	
	void findSecMaxNum(int arr[])
	{
		int max = 0;
		int sec = 0;
		for (int i =0; i < arr.length; i++)
		{
			if(arr[i]>max)
				sec = max;
				max = arr[i];
			for (int j =i+1; j < arr.length; j++)
			{
				if ((arr[i] > arr[j]) & (arr[i] < max))
				{
					sec = arr[i];
				}
				else if ((arr[j] > arr[i]) & (arr[j] < max))
				{
					sec = arr[j];
				}
			}
		}
		System.out.println("Second Largest number is " + sec);
	}
	
	
	public static void main(String[] args) {
		
		int[] num = {2,4,7,8,9,1};
		ArrayQ5 q5 = new ArrayQ5();
		q5.findSecMaxNum(num);
	}
}
