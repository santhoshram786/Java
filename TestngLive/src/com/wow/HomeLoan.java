package com.wow;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test
	public void ram_homeloan()
	{
		System.out.println("ram_homeloan");
		
	}
	@Test
	public void santhosh_homeloan()
	{
		System.out.println("santhosh_homeloan");
	}

	@AfterSuite
	public void aftersuitemethod()
	{
		System.out.println("I will come last");
	}
}
