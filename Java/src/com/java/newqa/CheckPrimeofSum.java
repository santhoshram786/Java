package com.java.newqa;

public class CheckPrimeofSum {

	public static void main(String[] args) {
	
		int num=100;
		System.out.println("Given Number is Prime or Not:"+isprime(num));
		boolean f=false;
		for(int i=2;i<=num/2;i++)
		{
			if(isprime(i))
			{
				if(isprime(num-i))
				{
					System.out.println(num+" = "+i+" + "+(num-i));
					f=true;
				}
			}
		}

		if(!f)
			System.out.println(num +"do not have sum of prime numbers");
	}
	
	public static boolean isprime(int n)
	{
		boolean prime= true;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
				
		}
		return prime;
		
	}

}
