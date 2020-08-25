package com.java.task4;

import java.util.Scanner;

public class Program_8 {


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
	      
	      transposeMatrix(arr,row,col);
	      
	      
	}
	
	
	
 private static void transposeMatrix(int[][] original, int row, int col) {
	
	 int transpose[][]=new int[row][col];    
	    

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[i][j] = original[j][i];
			}
		}    
		
		System.out.println("Matrix Before transpose:");  
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}    
		System.out.println("Matrix After Transpose:");  
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(transpose[i][j] + " ");
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
