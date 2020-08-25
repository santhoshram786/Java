package com.java.interviewqa;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d=9129;
		
		int res=0;
		
		int o=d;
		
		while(d!=0)
		{
			int r=d%10;
			res=res*10+r;
			d=d/10;
			
		}
		if(o==res)
		{
			System.out.println("P");
			
		}
		else
			System.out.println("NP");

	}

}
