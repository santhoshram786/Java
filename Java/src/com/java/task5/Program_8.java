package com.java.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Program_8 {

	static int pos=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created: ");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(getZerosfirst(myArray)));;

	}
	private static int[] getZerosfirst(int[] myArray) {
	
		int temp;
		for(int i=0;i<myArray.length;i++)
		{
			if(myArray[i]!=0)
			{
				myArray[pos]=myArray[i];
				pos++;
			}
			
		}
		
		while(pos<myArray.length)
		{
			myArray[pos]=0;
			pos++;
		}
		
		for(int i=0;i<myArray.length;i++)
		{
			for(int j=i;j<myArray.length;j++)
			{
				if(myArray[i]>myArray[j])
				{
					temp=myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=temp;
					
				}
			}
		}
		
		return myArray;
	}
	
	

}
