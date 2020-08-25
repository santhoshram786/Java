package com.java.newqa;

import java.util.Arrays;
import java.util.Scanner;

public class sorting2darray {
	
	static int x=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a=new int[5];
		
//		System.out.println("Enter numbers into Array:");
		
//		Scanner sc=new Scanner(System.in);
//		
//		 for(int i=0; i<a.length; i++ ) {
//	         a[i] = sc.nextInt();
//	      }
		
		
		int[] a= {4,4,4,6,6,8,8,8,1,22,22};
		
		int [][] b=new int[a.length][2];
		
		b[x][0]=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
				b[x][1]=b[x][1]+1;
			else
				x++;
			b[x][0]=a[i];
		}
		
		x++;
		
		a=sort(a);
		b=sort(b);

		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<=b[i][1];j++)
			{
				System.out.print(b[i][0]+",");
			}
		}
		System.out.println();
	}
	
	public static int[][] sort(int[][] b){
		
		int[] c=new int[2];
		
		for(int i=0;i<x;i++)
		{
			for(int j=i;j<x;j++)
			{
				if(b[i][1]<b[j][1])
				{
					c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
				
				
			}
		}
		for(int i=0;i<x;i++)
		{
			for(int j=i;j<x;j++)
			{
				if(b[i][1]==b[j][1])
				{
					if(b[i][0]<b[j][0])
					{
						c=b[i];
						b[i]=b[j];
						b[j]=c;
					}
				}
				
			}
		}
	
		
		return b;
		
	}
	
	public static int[] sort(int[] a)
	{
		
		int t;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}

			}
		}
		return a;
		
	}

}
