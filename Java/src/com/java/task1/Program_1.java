package com.java.task1;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter a String to Reverse it:");
		String str=s.next();
		
		int stringLength=str.length();
		
		String rev="";
		
		char[] c=str.toCharArray();
		
		for(int i=stringLength-1;i>=0;i--)
		{
			rev=rev+c[i];
			
		}

		System.out.println("Reversed String:"+rev);
	}

}
