package com.java.task2;

import java.util.Scanner;

public class Program_4 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=scan.next();
		
		char c[]=str.toCharArray();
		
		int f[]=new int[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			f[i]=1;
			
			for(int j=i+1;j<str.length();j++)
			{
				if(c[i]==c[j])
				{
					f[i]++;
					c[j]='$';
				}	
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		for(int i=0;i<f.length;i++)
		{
			if(c[i]!=' '&&c[i]!='$')
			{
				System.out.println(c[i]+" -->"+f[i]);
			}
				
		}
		  
	}
	
	
	  

}
