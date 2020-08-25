package com.java.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Program_1 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.print("Enter a String");
		String str=s.nextLine();
		
		char[] chars=str.toCharArray();
		
		getDuplicates(chars);
		
		
	}

	private static void getDuplicates(char[] chars) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : chars) {
			Integer count = map.get(c);

			if (count == null)
				map.put(c, 1);
			else
				map.put(c, ++count);

		}

		Set<Entry<Character, Integer>> entry = map.entrySet();

		for (Entry<Character, Integer> e : entry) {
			if (e.getValue() > 1) {
				if(e.getKey()!=' ')
				System.out.println("Duplicate Alphabet:" + e.getKey() + " with " + e.getValue() + " times");
			}
		}

	}

}
