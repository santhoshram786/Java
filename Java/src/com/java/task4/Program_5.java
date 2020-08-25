package com.java.task4;

import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Scanner scan = new Scanner(System.in);

	       System.out.print("Enter row for the array : ");
	       int row = scan.nextInt();
	       System.out.print("Enter column for the array : ");
	       int col = scan.nextInt();
	       int arr[][] = new int[row][col];
	       
	       System.out.println("Enter " +(row*col)+ " Array Elements : ");
	       
	      getMutidimensionalArray(arr,row,col,scan);
	       
	      getLowerTraigulatMatrix(arr);

	}
	
	private static void getLowerTraigulatMatrix(int[][] a) {
		// TODO Auto-generated method stub
		
		int rows = a.length;    
        int cols = a[0].length;    
          
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
  
            System.out.println("Lower triangular matrix: ");    
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                  if(j > i)    
                    System.out.print("0 ");    
                  else    
                    System.out.print(a[i][j] + " ");    
              }    
              System.out.println();    
          }    
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
