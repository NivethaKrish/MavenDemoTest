package com.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class HalfEbayTest {
	
	WebDriver driver;
	
	
	@Test
	@Parameters({"Url","emailId"})
	public void loginTest(String Url,String emailId)
	{
		
			System.setProperty("webdriver.chrome.driver", "C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(Url);
			System.out.println(emailId);
			
		
			
	}
	

	/**@Test(priority=2,dependsOnMethods="loginTest")
	public void pageLoad()
	{
		System.out.println("Page is loaded");
	}
	*/
	
	
	/**@Test(priority=4,invocationCount=10)
	public void countTest()
	{
		System.out.println("System");
	}
	
	@Test(invocationTimeOut=2)
	public void arithTest()
	{
		int i=9/0;
	}
	*/
	
}
