package com.java.interviewqa;

public class stringpalindrome {
	
	public static void main(String args[])
	{
		String a="aabbaa";
		
		int i=0;
		int j=a.length()-1;
		int f=0;
		while(i<j)
		{
			if(a.charAt(i)!=a.charAt(j))
			{	
		f=1;
			}
			i++;
			j--;
			
		}
	if(f!=1)
	System.out.println("P");
	else
		System.out.println("NP");
	}

}
