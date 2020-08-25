package com.wow;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Mobileloan {
	
	@Test
	public void Mobile_Loan_ram()
	{
		System.out.println("Mobile_Loan_ram");
	}
	@Test(groups= {"Smoke"})
	public void Mobile_Loan_nag()
	{
		System.out.println("Mobile_Loan_nag");
	}
	@BeforeSuite
	public void beforesuitemethod()
	{
		System.out.println("I will come first irescptive of test");
	}
	@Test
	public void Loan_naga()
	{
		System.out.println("Loan_naga");
	}
}
