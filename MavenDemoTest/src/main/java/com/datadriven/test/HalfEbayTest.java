package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@DataProvider
	public Iterator<Object[]> getdata()
	{
		ArrayList<Object[]> testdata = TestUtil.getExcelData();
		return testdata.iterator();
		
	}
	
	
	@Test(dataProvider="getdata")
	public void halfebayRegPageTest(String firstname,String lastname,String address1,String address2,String city,
			String state,String zip, String email)
	
	{
		driver.findElement(By.id("firstname")).clear();
		WebElement setfirstname = driver.findElement(By.id("firstname"));
		setfirstname.sendKeys(firstname);
		
		driver.findElement(By.id("lastname")).clear();
		WebElement setlastname = driver.findElement(By.id("lastname"));
		setlastname.sendKeys(lastname);
		
		
		driver.findElement(By.id("address1")).clear();
		WebElement setaddress1 = driver.findElement(By.id("address1"));
		setaddress1.sendKeys(address1);
		
		driver.findElement(By.id("address2")).clear();
		WebElement setaddress2 = driver.findElement(By.id("address2"));
		setaddress2.sendKeys(address2);
      
		driver.findElement(By.id("city")).clear();
		WebElement setcity = driver.findElement(By.id("city"));
		setcity.sendKeys(city);
		
		
		WebElement setstate = driver.findElement(By.id("state"));
		Select select = new Select(setstate);
		select.selectByVisibleText("New Jersey");
		
		driver.findElement(By.id("zip")).clear();
		WebElement setzip = driver.findElement(By.id("zip"));
		setzip.sendKeys(zip);
		
		driver.findElement(By.id("email")).clear();
		WebElement setemail = driver.findElement(By.id("email"));
		setemail.sendKeys(email);
		
		driver.findElement(By.id("retype_email")).clear();
		WebElement setretypeemail = driver.findElement(By.id("retype_email"));
		setretypeemail.sendKeys(email);
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
