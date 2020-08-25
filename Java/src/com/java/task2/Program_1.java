package com.java.task2;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);

	       System.out.print("Enter row for the array : ");
	       int row = scan.nextInt();
	       System.out.print("Enter column for the array : ");
	       int col = scan.nextInt();
	       int arr[][] = new int[row][col];
	       int arr2[][] = new int[row][col];
	       
	       
	       System.out.println("Enter " +(row*col)+ " Array Elements : ");
	       
	      getMutidimensionalArray(arr,row,col,scan);

	       System.out.println("Enter " +(row*col)+ " Array Elements : ");
	       
	      getMutidimensionalArray(arr2,row,col,scan);
	
	      getsum(arr, arr2,row,col);
	    

}
	static void getsum(int[][] arr,int[][] arr2,int row,int col)
	{
		  int[][] sum = new int[row][col];
	        for(int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                sum[i][j] = arr[i][j] + arr2[i][j];
	            }
	        }

	        System.out.println("Sum of two matrices is: ");
	        for(int[] r : sum) {
	            for (int column : r) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
		
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

