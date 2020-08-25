package com.java.task4;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean flag = true;    
		 Scanner scan = new Scanner(System.in);

	       System.out.print("Enter row for the array : ");
	       int rows = scan.nextInt();
	       System.out.print("Enter column for the array : ");
	       int cols = scan.nextInt();
	       int a[][] = new int[rows][cols];
	       getMutidimensionalArray(a,rows,cols,scan);

	          rows = a.length;    
	        cols = a[0].length;    
	            

	        if(rows != cols){    
	            System.out.println("Matrix should be a square matrix");    
	        }    
	        else {    
	            for(int i = 0; i < rows; i++){    
	                for(int j = 0; j < cols; j++){    
	                  if(i == j && a[i][j] != 1){    
	                      flag = false;    
	                      break;    
	                  }    
	                  if(i != j && a[i][j] != 0){    
	                      flag = false;    
	                      break;    
	                  }    
	                }    
	            }    
	                
	            if(flag)    
	                System.out.println("Given matrix is an identity matrix");    
	            else    
	                System.out.println("Given matrix is not an identity matrix");    
	        }    
	}
	static void getMutidimensionalArray(int[][] arr, int row, int col,Scanner scan) {
		
		System.out.println("Enter Elements");
		 
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
