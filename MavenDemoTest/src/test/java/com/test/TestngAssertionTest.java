package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	


public class TestngAssertionTest {
	
	WebDriver driver;
	
	
	
		@BeforeMethod
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("http://www.google.com");
			
		}
		
		/*@Test
		public void googleTitleTest()
		{
			
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google");
		}*/
		
		
		
		/*@Test
		public void googleTitleTest1()
		{
			
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title,"new","Title not matched");
		}
		*/
		
		@Test
		public void mail()
		{
			boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
			//Assert.assertTrue(b);
			Assert.assertEquals(b, true);
		}
		
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();
	}

}
