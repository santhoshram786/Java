package com.java.interviewqa;

public class Check {

	public static void main(String[] args) {
		
		System.out.println(10+20+"java");
		// TODO Auto-generated method stub
		
		System.out.println("java"+10+20);
		String b = String.format("%04d", 8);
		System.out.println(b);

		int j=9;
		String hex=Integer.toHexString(j);
		System.out.println(hex);
		String bin=Integer.toBinaryString(j);
		System.out.println(bin);
		String octa=Integer.toOctalString(j);
		System.out.println(octa);
		
		int decimal=Integer.parseInt(octa,8);  
		System.out.println(decimal);
		int decimal1=Integer.parseInt(hex,16);  
		System.out.println(decimal1);
		
		int decimal2=Integer.parseInt(bin,2);  
		System.out.println(decimal2);
		
		
		//filter(lambda x:all(x % y != 0 for y in range(2, x)), range(2, 13))
		//list(set(range(2,11)) - {x for x in range(11) for y in range(2,x) if x%y == 0})
		
		//[x for x in range(20) if all(x%y!=0 for yin range(2,x))]
	}

}
