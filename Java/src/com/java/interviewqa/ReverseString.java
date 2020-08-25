package com.java.interviewqa;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Goat";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
			
		}
		System.out.println(r);
		
		StringBuffer d=new StringBuffer(s);
		d.reverse();
		System.out.println(d);
		
		//for string we dont have .reverse function because strings are immutable
		//String buffer is mutable
		
		/*
		 * String vs StringBuffer vs StringBuilder
		 * 
			String is immutable whereas StringBuffer and StringBuider are mutable classes.
			StringBuffer is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder is more faster than StringBuffer.
			String concat + operator internally uses StringBuffer or StringBuilder class.
			For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.
		 * 
		 */

	}

}
