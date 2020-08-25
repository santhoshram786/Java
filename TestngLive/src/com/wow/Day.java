package com.wow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day {
	
	//testng itself acts as a java compiler and no need of using main function
	//to create the xml file just convert the java project to testng
	
	@BeforeClass
	public void bclass()
	{
		System.out.println("I will execute before every class");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("I will execute after every class");
	}
	@Test
	public void fish()
	{
		System.out.println("WOW!!!!");
	}
	@BeforeTest
	public void beforefish()
	{
		System.out.println("I will execute before every test");
	}
	@AfterTest
	public void afterfish()
	{
		System.out.println("I will execute after every test");
	}
}
