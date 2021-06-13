package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class HalfEbay {
	
	public static void main(String args[])
	
	{
	Xls_Reader reader = new Xls_Reader("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\testdata\\EbayData.xlsx");
	
	System.setProperty("webdriver.chrome.driver", "C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
	
	String firstname = reader.getCellData("RegisterTestData", 0, 2);
	

	WebElement setfirstname = driver.findElement(By.id("firstname"));
	setfirstname.sendKeys(firstname);
	
	reader.addColumn("RegisterTestData", "status");
	reader.setCellData("RegisterTestData", "status", 2, "pass");
	
}
}
