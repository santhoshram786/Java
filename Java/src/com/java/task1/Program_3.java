package com.java.task1;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size=s.nextInt();
		System.out.print("Enter the number to get desired output:");
		int k=s.nextInt();

		int[] Array_A=new int[size];

		System.out.println("Enter Elements into Array:");
		for(int i=0;i<Array_A.length;i++)
		{
			Array_A[i]=s.nextInt();
		}

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
		
		System.out.println(Array_A[0]);
		
		for(int i=0;i<size;i++)
		{
			if(Array_A[i]<k)
			{
				System.out.println("Largest number which is smaller than "+ k+" is:"+Array_A[i]);
				break;
			}
				
				
			
		}
	}

}
