package com.java.interviewqa;

import java.util.Arrays;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String g="^&&&&&&fun ja@33((((mnajhhh)))))******&^```jakk han";
		
		//We have to use regular expressions
		
		g=g.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(g);
		
		//split using whitespace
		
		
		String h="hi i am in uk";
		String[] phones = h.split("\\s+");
		System.out.println(Arrays.toString(phones));
		
		String ff="jad akka"
				+ "dnksadnslds"
				+ "fknsasalf";
		
		String[] parts = ff.split("\\r?\\n");
		
		System.out.println(Arrays.toString(parts));
	}

}
