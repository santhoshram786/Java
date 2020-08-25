package com.wow;

import org.testng.annotations.Test;

public class Dependsonmethods {
	
	//If I know that one test is having bug and I don't to run that test case then I use enabled=false
	@Test(enabled=false)
	public void errortest()
	{
		System.out.println("Don't run");
	}
	@Test()
	public void sec()
	{
		System.out.println("Firtst test case");
	}
	

	@Test(dependsOnMethods="sec")
	public void fir()
	{
		System.out.println("Second test case");
	}
	
	@Test
	public void nag()
	{
		System.out.println("sec1 test case");
	}
	@Test
	public void sam()
	{
		System.out.println("fir1 test case");
	}
	@Test(dependsOnMethods= {"nag","sam"})
	public void third()
	{
		System.out.println("After first");
	}

}
