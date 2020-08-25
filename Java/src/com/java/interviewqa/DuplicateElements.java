package com.java.interviewqa;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] dup={"a","k","g","a"};
		//O(n*2) (Time complexity)-worst solution
		
		for(int i=0;i<dup.length;i++)
		{
			for(int j=i+1;j<dup.length;j++)
			{
				if(dup[i].equals(dup[j]))
				{
					System.out.println("Duplicate::"+dup[i]);
				}
				else
					System.out.println("NO Duplicates");
			}
		}

		
		
		//To acheive time complexity O(n) we have to use HashSet
		//It stores only unique values
		
		Set<String> s=new HashSet<String>();
		for(String n:dup) {
			if(s.add(n)==false)
			{
				System.out.println("Duplicate::"+n);
			}
		}
		
		
		//Using HashMap O(2n)
		
		Map<String, Integer> m=new HashMap<String, Integer>();
		
		for(String n:dup)
		{
			Integer c=m.get(n);
			if(c==null) {
				m.put(n, 1);
			}
			else
			{
				m.put(n, ++c);
			}
		}
		System.out.println(m);
		Set<Entry<String, Integer>> es=m.entrySet();
		System.out.println(es);
		for(Entry<String, Integer> e:es)
		{
			if(e.getValue()>1)
			{
				System.out.println("Dup:::"+e.getKey());
			}
		}
		
		Set<String> w=m.keySet();
		for(String s1:w)
		{
			if(m.get(s1)>1)
			{
				System.out.println(s1+"::"+m.get(s1));
			}
		}
		
	}

}
