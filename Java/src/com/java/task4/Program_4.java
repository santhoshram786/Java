package com.java.task4;

import java.util.Scanner;

public class Program_4 {
	

	
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
	
	      Boolean result=getMatch(arr, arr2,row,col);
	      
	      if(result==true)
	    	  System.out.println("Both matrices are matched");
	      else
	    	  System.out.println("Not matched");
	    

}
	static boolean getMatch(int[][] arr,int[][] arr2,int row,int col)
	{
		boolean flag=false;
		  int[][] sum = new int[row][col];
	        for(int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	            	if(arr[i][j] == arr2[i][j])
	            		flag=true;
	            	else
	            		flag=false;
	            
	            }
	        }
	        return flag;
	
		
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
