package com.java.task1;

import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		System.out.println("If Yes then it is power of 2 or else No");
		System.out.print("Enter a positive Number:");
		int a=s.nextInt();
		
		 if (check(a)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
		
	}
	
	public static boolean check(int a)
	{
		if(a==0)
			return false;
					
		while(a!=1)
		{
			if(a%2!=0)
				return false;
			a=a/2;
		}
		
		return true;
		
	}

}
