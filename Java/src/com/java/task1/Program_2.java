package com.java.task1;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size=s.nextInt();
		int[] Array_A=new int[size];
		int[] Array_B=new int[size];
		
		int B_size=size;
		
		System.out.println("Enter Elements into Array:");
		for(int i=0;i<Array_A.length;i++)
		{
			Array_A[i]=s.nextInt();
		}
		
		for(int i=0;i<Array_A.length;i++)
		{
			Array_B[B_size-1]=Array_A[i];
			B_size=B_size-1;
		}
		System.out.println("Reversed Array:");
		for(int i=0;i<Array_B.length;i++)
		{
			System.out.println(Array_B[i]);
		}
		
		
	}

}
