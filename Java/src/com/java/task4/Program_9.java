package com.java.task4;

import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=s.next();
		
		 String result="";  
	        int n = str.length();  
	        for(int i = 0; i < n; i++){  
	            for(int j = i+1; j < n; j++){  
 
	                String temp = largestrepeatingsequence(str.substring(i,n),str.substring(j,n));  
 
	                if(temp.length() > result.length())
	                	result=temp;
	            }  
	        }  
	        System.out.println("Longest repeating sequence: "+result);  
	    }

	private static String largestrepeatingsequence(String s, String t) {
		
		int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  

	
	}  


}
