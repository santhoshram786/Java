package com.java.task1;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter first Number:");
		int a=s.nextInt();
		System.out.print("Enter Second Number:");
		int b=s.nextInt();
		
		System.out.println("Before Swapping:"+a + "  " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping:"+a + "  " +b);

	}

}
