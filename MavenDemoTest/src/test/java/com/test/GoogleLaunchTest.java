package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleLaunchTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("http://www.google.com");
	}
	
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{
		
		System.out.println("Test");
	}
	
	
	
	@Test(priority=2,groups="Link")
	public void mailLinkTest()
	{
		WebElement mail =  driver.findElement(By.linkText("Gmail"));
		boolean b2 = mail.isDisplayed();
		System.out.println(b2);
	}
	
	@Test(priority=3,groups="Test")
	public void Test1()
	{
		
		System.out.println("Test1");
	}
	

	@Test(priority=4,groups="Test")
	public void Test2()
	{
		
		System.out.println("Test2");
	}
	
	

	@Test(priority=5,groups="Test")
	public void Test3()
	{
		
		System.out.println("Test3");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
