package com.java.newqa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToHexExample {
	 static int i = 0;
	public static void main(String args[])
	   {
	     Scanner input = new Scanner( System.in );
	     System.out.print("Enter a decimal number : ");
	     int num =input.nextInt();
	     System.out.println(DecimaltoOcta(num));
	     System.out.println(DecimtoHexa(num));
	     decToBinary(num);
	     //System.out.println(Integer.toBinaryString(1142));
	  }
	public static void decToBinary(int n) 
    { 
		// array to store binary number 
        int[] binaryNum = new int[32]; 
  
        // counter for binary array 
       
        while (n > 0) { 
            // storing remainder in binary array 
            binaryNum[i++] = n % 2; 
            n = n / 2; 
          
        } 
//  
//        System.out.println(i);
//        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]);

        
	
    } 
	
	public static String DecimaltoOcta(int num)
	{
		// For storing remainder
	     int rem;
	        
	     // For storing result
	     String str2=""; 
	 
	     // Digits in hexadecimal number system
	     char hex[]={'0','1','2','3','4','5','6','7','8'};
	 
	     while(num>0)
	     {
	       rem=num%8; 
	       str2=hex[rem]+str2; 
	       num=num/8;
	     }
		return str2;
		
	}
	
	public static String DecimtoHexa(int num)
	{
	     int rem;
	        
	     // For storing result
	     String str2=""; 
	 
	     // Digits in hexadecimal number system
	     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	 
	     while(num>0)
	     {
	       rem=num%16; 
	       str2=hex[rem]+str2; 
	       num=num/16;
	     }
	     return str2;
		
	}

}
