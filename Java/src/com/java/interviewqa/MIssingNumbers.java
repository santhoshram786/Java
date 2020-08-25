package com.java.interviewqa;

public class MIssingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5,7};
		int sum=0;
		int sum1=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		for(int j=1;j<=7;j++)
		{
			sum1=sum1+j;
		}
		
		System.out.println(sum1);
		
		int missing=sum1-sum;
		System.out.println(missing);
				
	}

}
