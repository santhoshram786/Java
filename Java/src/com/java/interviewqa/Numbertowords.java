package com.java.interviewqa;

public class Numbertowords {

	
	public  void  pw(long n,String c) {
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
 
		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
 
		if (n > 19)
		{
			System.out.print(ten[(int) (n / 10)] + " " + one[(int) (n % 10)]);
		}
		else
		{
			System.out.print(one[(int) n]);
		}
		if (n > 0)
			System.out.print(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n=4500;
		System.out.print(n);
		if (n <= 0)
		{
			System.out.println("Enter numbers greater than 0");
		}
		else
		{
			Numbertowords a = new Numbertowords();
			a.pw((n / 1000000000), " Hundred");
			a.pw((n / 10000000) % 100, " crore");
			a.pw(((n / 100000) % 100), " lakh");
			a.pw(((n / 1000) % 100), " thousand");
			a.pw(((n / 100) % 10), " hundred");
			a.pw((n % 100), " ");
		}


	}

}
