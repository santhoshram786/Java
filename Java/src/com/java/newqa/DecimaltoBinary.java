package com.java.newqa;

public class DecimaltoBinary {
	
	 static int i = 0;
	static void decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[32]; 
  
        // counter for binary array 
       
        while (n > 0) { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
  
        System.out.println(i);
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    } 
	
    // driver program 
    public static void main(String[] args) 
    { 
        int n = 1142; 
        decToBinary(n); 
        int i=15;
        System.out.println("");
        System.out.println( Integer.toBinaryString(i));
        System.out.println( Integer.toOctalString(i));
        System.out.println( Integer.toHexString(i));
    } 

}
