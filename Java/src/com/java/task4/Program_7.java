package com.java.task4;

import java.util.Scanner;

public interface Program_7 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter row for the array : ");
		int row = scan.nextInt();
		System.out.print("Enter column for the array : ");
		int col = scan.nextInt();
		int arr[][] = new int[row][col];

		System.out.println("Enter " + (row * col) + " Array Elements : ");

		getMutidimensionalArray(arr, row, col, scan);

		getOddandEvenFrequency(arr, row, col);

	}
	
	

	public static void getOddandEvenFrequency(int[][] a,int rows,int cols) {

		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] % 2 == 0)
					countEven++;
				else
					countOdd++;
			}
		}

		System.out.println("Frequency of odd numbers: " + countOdd);
		System.out.println("Frequency of even numbers: " + countEven);

	}



	static void getMutidimensionalArray(int[][] arr, int row, int col,Scanner scan) {
		 
		 for(int i=0; i<row; i++)
	       {
	           for(int j=0; j<col; j++)
	           {
	               arr[i][j] = scan.nextInt();
	           }
	       }

	       System.out.print("The Array is :\n");
	       for(int i=0; i<row; i++)
	       {
	           for(int j=0; j<col; j++)
	           {
	               System.out.print(arr[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	
		
		
	}








}
