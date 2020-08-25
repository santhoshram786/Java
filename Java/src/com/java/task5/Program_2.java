package com.java.task5;

import java.util.Scanner;

public class Program_2 {


	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size=s.nextInt();
		int[] Array_A=new int[size];
		System.out.println("Enter Elements into Array:");
		
		for(int i=0;i<Array_A.length;i++)
			Array_A[i]=s.nextInt();

		int temp;
		for (int i = 0; i < size; i++)   
        {  
            for (int j = i + 1; j < size; j++)   
            {  
                if (Array_A[i] < Array_A[j])   
                {  
                    temp = Array_A[i];  
                    Array_A[i] = Array_A[j];  
                    Array_A[j] = temp;  
                }  
            }  
        }  
		
		System.out.println("Second Largest Number in the given Array is:"+Array_A[1]);
		
		
	}



}
