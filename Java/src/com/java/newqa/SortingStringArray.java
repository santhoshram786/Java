package com.java.newqa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a= {"s","r","a","e","b"};
		
		
		//Ascending Order
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		//Descending Order
		
		Arrays.sort(a,Collections.reverseOrder());
		
		
		System.out.println(Arrays.toString(a));
		
		
		List al =Arrays.asList(1,2,8,7,9);
		
		Collections.swap(al, 3, 4);
		
		System.out.println(al);
		
		
		
		
		
		

	}

}
