package com.java.interviewqa;

public class Reverseinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12345;
		int r=0;
		int s=0;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
					
		}
		System.out.println(s);		
		
		long t=87766321;
		StringBuffer g=new StringBuffer(String.valueOf(t));
		g.reverse();
		System.out.println(g);
	}

}
