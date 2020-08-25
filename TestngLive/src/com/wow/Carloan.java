package com.wow;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Carloan {
	
	@Test
	public void sam_Carloan()
	{
		System.out.println("sam_Carloan");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will execute before every test");
	}
	@Parameters({"Username"})
	@Test(groups= {"Smoke"})
	public void nag_Carloan(String name)
	{
		System.out.println("nag_Carloan");
		System.out.println(name);
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("I will execute after every test");
	}
}
