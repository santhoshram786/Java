package com.java.task5;

import java.util.Scanner;

public class Program_6 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		
		isBinary(num);

	}

	private static void isBinary(int number) {
		boolean isBinary = true;

		int copyOfNumber = number;

		while (copyOfNumber != 0) {
			int temp = copyOfNumber % 10;
			if (temp > 1) {
				isBinary = false;
				break;
			} else
				copyOfNumber = copyOfNumber / 10;
		}

		if (isBinary)
			System.out.println(number + " is a binary number");
		else
			System.out.println(number + " is not a binary number");

	}

}
