package com.java.task5;

import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter the size of the array that should be " + n + "-1");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}

		getMissingNumber(myArray, n);

	}

	private static void getMissingNumber(int[] a, int n) {
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < a.length; i++)
			sum = sum + a[i];
		for (int j = 1; j <= n; j++)
			sum1 = sum1 + j;
		int missing = sum1 - sum;
		System.out.println("The Missing number in the Sequence is:" + missing);

	}

}
