package com.java.newqa;

import java.util.Arrays;

public class Sorting {

	static int p=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mainArray[] = { 9, 9, 1, 2, 2, 2, 4, 4, 4, 4 };

		int dualArray[][] = new int[mainArray.length][2];

		mainArray = sort(mainArray);

		dualArray[p][0] = mainArray[0];

		for (int i = 1; i < mainArray.length; i++) 
		{
			if (mainArray[i] == mainArray[i - 1])
				dualArray[p][1] = dualArray[p][1] + 1;
			else
			{
				p++;
				dualArray[p][0] = mainArray[i];
			}
		}

		p++;

		
		dualArray = sort(dualArray);

		System.out.println(Arrays.toString(mainArray));

		System.out.println(Arrays.deepToString(dualArray));
		
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<=dualArray[i][1];j++)
			{
				System.out.print(" "+dualArray[i][0]);
			}
		}
		
	}


	public static int[][] sort(int[][] dualArray)
	{
		
		int[] t=new int[2];
		
		for(int i=0;i<p;i++)
		{
			for(int j=i;j<p;j++)
			{
				if(dualArray[i][1]<dualArray[j][1])
					
				{
				t=dualArray[i];
				dualArray[i]=dualArray[j];
				dualArray[j]=t;
				}
			}
		}
		return dualArray;
		
	}
	public static int[] sort(int[] mainArray)
	{
		int t;
		for(int i=0;i<mainArray.length;i++)
		{
			for(int j=i+1;j<mainArray.length;j++)
			{
				if(mainArray[i]>mainArray[j])
				{
					t=mainArray[i];
					mainArray[i]=mainArray[j];
					mainArray[j]=t;		
					
				}
				
			}
			
			
		}
		return mainArray;
	}
}


//for(int i=0;i<mainArray.length-1;i++)
//{
//	System.out.println(mainArray[i]);
//}

//for(int a:mainArray)
//	System.out.println(a);


	//Arrays.sort(mainArray);