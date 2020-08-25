package com.java.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Program_8 {

	static int pos=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s =new Scanner(System.in);
			System.out.print("Enter the size of an array:");
			int size=s.nextInt();

			int[] array1=new int[size];
			int[] array2=new int[size];
		
			insertArray(array1, s);
			
			insertArray(array2, s);

	        int length = array1.length + array2.length;

	        int[] result = new int[length];
	       
	        for (int element : array1) {
	            result[pos] = element;
	            pos++;
	        }

	        for (int element : array2) {
	            result[pos] = element;
	            pos++;
	        }

	        System.out.println(Arrays.toString(result));

	}

	static void insertArray(int[] array1,Scanner s)
	{
		System.out.println("Enter Elements into Array:");
		
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=s.nextInt();
		}
	}
}
