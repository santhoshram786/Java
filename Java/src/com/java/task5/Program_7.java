package com.java.task5;

import java.util.Scanner;

public class Program_7 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1=s.nextLine();
		System.out.println("Enter the String2:");
		String str2=s.nextLine();
		
		System.out.println(checkRotation(str1, str2));
	}
	
	public static boolean checkRotation(String st1, String st2) {  
        if (st1.length() != st2.length()) {  
            return false;  
        }  
        String st3 = st1 + st1;  
        if (st3.contains(st2))  
            return true;  
        else  
            return false;  
    }  

}
