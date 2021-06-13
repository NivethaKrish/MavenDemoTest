package com.test;

import org.testng.annotations.Test;

public class TestngExpectedExceptionTest {

	
	@Test(expectedExceptions=NumberFormatException.class)
	public void sum()
	
	{
		String s="100A";
		int j = Integer.parseInt(s);
		System.out.println(j);
	}
	
	@Test
	public void sum2()
	
	{
		String s1="1100A";
		int j1 = Integer.parseInt(s1);
		System.out.println(j1);
	}
	
	
	
}
