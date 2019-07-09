package shantanuG;

import java.util.Scanner;

public class FirstDifferIndex {
	void findFirstDifferIndex(int[] firstArray,int[] secondArray)
	{
		boolean flag=false;
		if(firstArray.length!=secondArray.length)
		{
			System.out.println("Arrays should be of same size");
		}
		else
		{
			for(int i=0, j=0;j<secondArray.length;j++,i++)
			{
				if(firstArray[i]!=secondArray[i])
				{
					flag=true;
					System.out.println("Values are not matching at index -> "+i);
					break;
				}
			}
			if(flag==false)
				System.out.println("Both the arrays are identical");
	
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of first array");
		String fArray=sc.nextLine();
		String[] fArrayElements=fArray.split(" ");
		int[] firstArray=new int[fArrayElements.length];
		for(int i=0;i<fArrayElements.length;i++)
			firstArray[i]=Integer.parseInt(fArrayElements[i]);
		System.out.println("Enter elements of second array");
		String sArray=sc.nextLine();
		String[] sArrayElements=sArray.split(" ");
		int[] secondArray=new int[sArrayElements.length];
		for(int i=0;i<sArrayElements.length;i++)
			secondArray[i]=Integer.parseInt(sArrayElements[i]);
		
		FirstDifferIndex firstDifferIndex=new FirstDifferIndex();
		firstDifferIndex.findFirstDifferIndex(firstArray,secondArray);
	}

}
