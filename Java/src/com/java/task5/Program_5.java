package com.java.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created: ");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		System.out.println("Enter the required sum: ");
		int reqSum = sc.nextInt();
		
		findSubArray(myArray, reqSum);

	}
	
	 static void findSubArray(int[] inputArray, int inputNumber)
	{

		int sum = inputArray[0];
		int start = 0;

		for (int i = 1; i < inputArray.length; i++) {

			sum = sum + inputArray[i];

			while (sum > inputNumber && start <= i - 1) {

				sum = sum - inputArray[start];

				start++;
			}

			if (sum == inputNumber) {
				System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is "
						+ inputNumber + " is ");

				for (int j = start; j <= i; j++)
					System.out.print(inputArray[j] + " ");

				System.out.println();
			}
		}
	}
	 

}
