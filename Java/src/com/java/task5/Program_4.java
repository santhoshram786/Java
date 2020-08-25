package com.java.task5;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size=s.nextInt();
		int[] Array_A=new int[size];
		
		System.out.println("Enter Elements into Array:");
		for(int i=0;i<Array_A.length;i++)
			Array_A[i]=s.nextInt();
		System.out.println("Enter the Key to be summed up:");
		
		int key=s.nextInt();
		
		pairs_value(Array_A, key);

	}
	
	static void  pairs_value(int inputArray[], int inputNumber)
	{
		boolean flag =false;
		System.out.println("Pairs of elements and their sum : ");

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber)
				{
					System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
					flag=true;
				}
				
			}
		}
		
		if(flag==false)
			System.out.println("Sorry! There are no matching pairs for the provided key");
	}

}
