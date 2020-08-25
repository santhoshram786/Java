package com.java.interviewqa;

public class StringtoNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="155";
		char[] c=s.toCharArray();
		int sum=0;
		//get acii value of 0
		int a=(int)'0';
		System.out.println(a);
		
		for(char c1:c)
		{
			int t=(int)c1;
			sum=(sum*10)+(t-a);
		}
		System.out.println(sum);

	}

}
