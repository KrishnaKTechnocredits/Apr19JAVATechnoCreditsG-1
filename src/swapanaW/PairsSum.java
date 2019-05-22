package swapanaW;

import java.util.Scanner;

/* Pairs of array elements to be matched with the given sum  */

public class PairsSum {

	public static void main(String[] args) {
		System.out.println("Please enter the values of array: ");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the sum to be compared with array values :");
		int sum = sc.nextInt();
		sumPairs(array, sum);
	}

	static void sumPairs(int[] array, int sum) {

		for(int i =0; i<array.length; i++){
			for(int j = i+1; j<array.length ; j++){
				if(array[i]+array[j]==sum)
				{
					System.out.println("{" +array[i]+"," +array[j]+"} = " +sum );
					break;
				}
			}
		}
	}
}