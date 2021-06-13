package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HalfEbayTest2 {
	
WebDriver driver;
SoftAssert sa = new SoftAssert();
	
	@BeforeMethod()
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	
	@Test(priority=1)
	public void mailLinkTest()
	{
		
		/**WebElement Gmail = driver.findElement(By.xpath("//a[@class='gb_g']"));
		boolean b= Gmail.isDisplayed();
		Assert.assertTrue(b);
		*/
		System.out.println("URL loaded");
		//sa.assertEquals(true,false,"page not loaded");
		
		System.out.println("Login page");
		System.out.println("Home page");
		//sa.assertEquals(true, true);
		
		System.out.println("Registration page");
		System.out.println("Contact Creation page");
		
		//sa.assertAll();
		
	}
	
	
	@Test(priority=2)
	public void logoLinkTest()
	{
		
		/**WebElement Gmail = driver.findElement(By.xpath("//a[@class='gb_g']"));
		boolean b= Gmail.isDisplayed();
		Assert.assertTrue(b);
		*/
		System.out.println("URL loaded");
		//sa.assertEquals(true,false,"URL not loaded");
		
		System.out.println("Login page");
		System.out.println("Home page");
		//sa.assertEquals(true, true);
		
		System.out.println("Registration page");
		System.out.println("Contact Creation page");
		
		//sa.assertAll();
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}

	

