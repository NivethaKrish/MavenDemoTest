package com.test;

import org.testng.annotations.Test;

public class TestngInvocationTimeOutTest {

	
	@Test(invocationTimeOut=2000)
	public void Testing()
	{
		int i=1;
		while(i==1)
		{
					System.out.println("i");
	}
}
}