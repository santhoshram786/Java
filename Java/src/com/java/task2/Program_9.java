package com.java.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Character:");
		char c=scan.next().charAt(0);
		String st = Character.toString(c);
		
		
		System.out.println("The string is: " + st);
		
		System.out.println("Enter the size of Char Array");
		int size=scan.nextInt();
		
		char[] ch=new char[size];
		System.out.println("Enter char Array:");
		for(int i=0;i<size;i++)
			ch[i]=scan.next().charAt(0);
		
		String st1 = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println("The string is: " + st1);
        System.out.println("The string is: " + st2);

        
         ch= st1.toCharArray();
        System.out.println("String to Char Array:"+Arrays.toString(ch));
	}

}
