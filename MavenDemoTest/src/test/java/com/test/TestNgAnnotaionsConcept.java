package com.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotaionsConcept {



		WebDriver driver;
		
		@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("BeforeSuite");
		}
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("BeforeTest");
		}
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("BeforeClass");
		}
		
		@BeforeMethod()
		public void maximize()
		{
			System.out.println("BeforeMethod");
		}
		
		@Test
		public void loginTest()
		{
			System.out.println("Test");
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("AfterMethod");
		}
		
				
		@AfterClass
		public void afterclass()
		{
			System.out.println("AfterClass");
		}
		
		@AfterTest
		public void aftertest()
		{
			System.out.println("AfterTest");
		}
		
		@AfterSuite
		public void aftersuite()
		{
			System.out.println("AfterSuite");
		}
	
	}


