package com.java.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s =new Scanner(System.in);
		System.out.print("Enter a String");
		String str=s.nextLine();
		
		char[] chars=str.toCharArray();
		
		getFirstRepeatedAndNonRepeatedCharacter(chars);
	}

	private static void getFirstRepeatedAndNonRepeatedCharacter(char[] chars) {

		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:chars)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
			
		}
		
		for(char c:chars)
		{
			if(map.get(c)==1) {
				System.out.println("The first non repetitive character in the String is:"+c);
				break;
			}
				
		}
		
		for(char c:chars)
		{
			if(map.get(c)>1)
			{
				System.out.println("The first  repetitive character in the String is:"+c);
				break;
			}
				
		}
	}

}
